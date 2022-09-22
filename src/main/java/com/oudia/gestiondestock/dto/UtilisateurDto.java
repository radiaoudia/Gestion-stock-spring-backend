package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Adresse;
import com.oudia.gestiondestock.model.Utilisateur;
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

    public Utilisateur fromEntity(UtilisateurDto utilisateurDto) {
        if (utilisateurDto == null) {
            return null;
        }

        return Utilisateur.builder()
                .id(utilisateurDto.getId())
                .nom(utilisateurDto.getNom())
                .prenom(utilisateurDto.getPrenom())
                .email(utilisateurDto.getEmail())
                .dateDeNaissance(utilisateurDto.getDateDeNaissance())
                .motDePasse(utilisateurDto.getMotDePasse())
                .adresse(utilisateurDto.getAdresse())
                .photo(utilisateurDto.getPhoto())
                .entreprise(utilisateurDto.getEntreprise().fromEntity(utilisateurDto.getEntreprise()))
                .build();
    }

    public UtilisateurDto toEntity(Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
        }

        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .motDePasse(utilisateur.getMotDePasse())
                .adresse(utilisateur.getAdresse())
                .photo(utilisateur.getPhoto())
                .build();
    }
}
