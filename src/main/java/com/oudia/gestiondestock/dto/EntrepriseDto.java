package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Adresse;
import com.oudia.gestiondestock.model.Entreprise;
import com.oudia.gestiondestock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {
    private Integer id;

    private String nom;

    private String description;

    private Adresse adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    private List<UtilisateurDto> utilisateurList;

    public Entreprise fromEntity(EntrepriseDto entrepriseDto) {
        if (entrepriseDto == null) {
            return null;
        }

        return Entreprise.builder()
                .id(entrepriseDto.getId())
                .nom(entrepriseDto.getNom())
                .description(entrepriseDto.getDescription())
                .adresse(entrepriseDto.getAdresse())
                .codeFiscal(entrepriseDto.getCodeFiscal())
                .photo(entrepriseDto.getPhoto())
                .email(entrepriseDto.getEmail())
                .numTel(entrepriseDto.getNumTel())
                .siteWeb(entrepriseDto.getSiteWeb())
                .build();
    }

    public EntrepriseDto toEntity(Entreprise entreprise) {
        if (entreprise == null) {
            return null;
        }

        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .adresse(entreprise.getAdresse())
                .codeFiscal(entreprise.getCodeFiscal())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .siteWeb(entreprise.getSiteWeb())
                .build();
    }
}
