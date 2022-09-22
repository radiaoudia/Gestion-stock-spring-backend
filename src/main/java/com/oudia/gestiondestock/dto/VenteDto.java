package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Article;
import com.oudia.gestiondestock.model.Vente;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class VenteDto {
    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    public Vente fromEntity(VenteDto venteDto) {
        if (venteDto == null) {
            return null;
        }

        return Vente.builder()
                .id(venteDto.getId())
                .code(venteDto.getCode())
                .dateVente(venteDto.getDateVente())
                .commentaire(venteDto.getCommentaire())
                .build();
    }

    public VenteDto toEntity(Vente vente) {
        if (vente == null) {
            return null;
        }

        return VenteDto.builder()
                .id(vente.getId())
                .code(vente.getCode())
                .dateVente(vente.getDateVente())
                .commentaire(vente.getCommentaire())
                .build();
    }
}
