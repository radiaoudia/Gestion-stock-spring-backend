package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private String motDePasse;

    private Adresse adresse;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;
}
