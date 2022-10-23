package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    private Integer id;

    private String code;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private CategorieDto categorie;

    public Article fromEntity(ArticleDto articleDto) {
        if (articleDto == null) {
            return null;
        }

        return Article.builder()
                .id(articleDto.getId())
                .code(articleDto.getCode())
                .designation(articleDto.getDesignation())
                .prixUnitaireHt(articleDto.getPrixUnitaireHt())
                .tauxTva(articleDto.getTauxTva())
                .prixUnitaireTtc(articleDto.getPrixUnitaireTtc())
                .photo(articleDto.getPhoto())
                .categorie(articleDto.getCategorie().toEntity(articleDto.getCategorie()))
                .build();
    }

    public ArticleDto toEntity(Article article) {
        if (article == null) {
            return null;
        }
        return ArticleDto.builder()
                .id(article.getId())
                .code(article.getCode())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .tauxTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .build();
    }
}
