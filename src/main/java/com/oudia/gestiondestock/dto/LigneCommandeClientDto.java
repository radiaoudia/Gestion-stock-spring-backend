package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDto {
    private Integer id;

    private ArticleDto article;

    private CommandeClientDto commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public LigneCommandeClient fromEntity(LigneCommandeClientDto ligneCommandeClientDto) {
        if (ligneCommandeClientDto == null) {
            return null;
        }

        return LigneCommandeClient.builder()
                .id(ligneCommandeClientDto.getId())
                .article(ligneCommandeClientDto.getArticle().fromEntity(ligneCommandeClientDto.getArticle()))
                .commandeClient(ligneCommandeClientDto.getCommandeClient().fromEntity(ligneCommandeClientDto.getCommandeClient()))
                .quantite(ligneCommandeClientDto.getQuantite())
                .prixUnitaire(ligneCommandeClientDto.getPrixUnitaire())
                .build();
    }

    public LigneCommandeClientDto toEntity(LigneCommandeClient ligneCommandeClient) {
        if (ligneCommandeClient == null) {
            return null;
        }

        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .build();
    }
}
