package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.LigneCommandeFournisseur;
import com.oudia.gestiondestock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private Integer id;

    private VenteDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public LigneVente fromEntity(LigneVenteDto ligneVenteDto) {
        if (ligneVenteDto == null) {
            return null;
        }

        return LigneVente.builder()
                .id(ligneVenteDto.getId())
                .vente(ligneVenteDto.getVente().fromEntity(ligneVenteDto.getVente()))
                .quantite(ligneVenteDto.getQuantite())
                .prixUnitaire(ligneVenteDto.getPrixUnitaire())
                .build();
    }

    public LigneVenteDto toEntity(LigneVente ligneVente) {
        if (ligneVente == null) {
            return null;
        }

        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .build();
    }
}
