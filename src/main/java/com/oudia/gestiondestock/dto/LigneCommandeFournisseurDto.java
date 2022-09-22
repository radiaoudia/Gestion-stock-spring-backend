package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.LigneCommandeFournisseur;
import com.oudia.gestiondestock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {
    private Integer id;

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseur;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public LigneCommandeFournisseur fromEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
        if (ligneCommandeFournisseurDto == null) {
            return null;
        }

        return LigneCommandeFournisseur.builder()
                .id(ligneCommandeFournisseurDto.getId())
                .article(ligneCommandeFournisseurDto.getArticle().fromEntity(ligneCommandeFournisseurDto.getArticle()))
                .commandeFournisseur(ligneCommandeFournisseurDto.getCommandeFournisseur().fromEntity(ligneCommandeFournisseurDto.getCommandeFournisseur()))
                .quantite(ligneCommandeFournisseurDto.getQuantite())
                .prixUnitaire(ligneCommandeFournisseurDto.getPrixUnitaire())
                .build();
    }

    public LigneCommandeFournisseurDto toEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
        if (ligneCommandeFournisseur == null) {
            return null;
        }

        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .quantite(ligneCommandeFournisseur.getQuantite())
                .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
                .build();
    }
}
