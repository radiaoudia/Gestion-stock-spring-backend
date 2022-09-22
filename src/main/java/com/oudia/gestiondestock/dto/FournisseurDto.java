package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Adresse;
import com.oudia.gestiondestock.model.Article;
import com.oudia.gestiondestock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;

    public Fournisseur fromEntity(FournisseurDto fournisseurDto) {
        if (fournisseurDto == null) {
            return null;
        }

        return Fournisseur.builder()
                .id(fournisseurDto.getId())
                .nom(fournisseurDto.getNom())
                .prenom(fournisseurDto.getPrenom())
                .adresse(fournisseurDto.getAdresse())
                .photo(fournisseurDto.getPhoto())
                .mail(fournisseurDto.getMail())
                .numTel(fournisseurDto.getNumTel())
                .build();
    }

    public FournisseurDto toEntity(Fournisseur fournisseur) {
        if (fournisseur == null) {
            return null;
        }

        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .adresse(fournisseur.getAdresse())
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .numTel(fournisseur.getNumTel())
                .build();
    }
}
