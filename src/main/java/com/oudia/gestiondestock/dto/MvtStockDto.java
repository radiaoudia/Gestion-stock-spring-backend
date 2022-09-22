package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.MvtStock;
import com.oudia.gestiondestock.model.TypeMvtStk;
import com.oudia.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStockDto {
    private Integer id;

    private ArticleDto article;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvtStk;

    public MvtStock fromEntity(MvtStockDto mvtStockDto) {
        if (mvtStockDto == null) {
            return null;
        }

        return MvtStock.builder()
                .id(mvtStockDto.getId())
                .dateMvt(mvtStockDto.getDateMvt())
                .quantite(mvtStockDto.getQuantite())
                .article(mvtStockDto.getArticle().fromEntity(mvtStockDto.getArticle()))
                .typeMvtStk(mvtStockDto.getTypeMvtStk())
                .build();
    }

    public MvtStockDto toEntity(MvtStock mvtStock) {
        if (mvtStock == null) {
            return null;
        }

        return MvtStockDto.builder()
                .id(mvtStock.getId())
                .dateMvt(mvtStock.getDateMvt())
                .quantite(mvtStock.getQuantite())
                .typeMvtStk(mvtStock.getTypeMvtStk())
                .build();
    }
}
