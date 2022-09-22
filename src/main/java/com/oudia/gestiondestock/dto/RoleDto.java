package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Entreprise;
import com.oudia.gestiondestock.model.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {
    private Integer id;

    private String nomRole;

    private UtilisateurDto utilisateur;

    public Role fromEntity(RoleDto roleDto) {
        if (roleDto == null) {
            return null;
        }

        return Role.builder()
                .id(roleDto.getId())
                .nomRole(roleDto.getNomRole())
                .utilisateur(roleDto.getUtilisateur().fromEntity(roleDto.getUtilisateur()))
                .build();
    }

    public RoleDto toEntity(Role role) {
        if (role == null) {
            return null;
        }

        return RoleDto.builder()
                .id(role.getId())
                .nomRole(role.getNomRole())
                .build();
    }
}
