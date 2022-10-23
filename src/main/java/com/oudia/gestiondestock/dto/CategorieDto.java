package com.oudia.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oudia.gestiondestock.model.Categorie;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategorieDto {
    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> Articles;

    public CategorieDto fromEntity(Categorie categorie) {
        if (categorie == null) {
            return null;
        }
        return CategorieDto.builder()
                .id(categorie.getId())
                .code(categorie.getCode())
                .designation(categorie.getDesignation())
                .build();
    }

    public Categorie toEntity(CategorieDto categorieDto) {
        if (categorieDto == null) {
            return null;
            //TODO throw an exception
        }
        return Categorie.builder()
                .id(categorieDto.getId())
                .code(categorieDto.getCode())
                .designation(categorieDto.getDesignation())
                .build();
    }
}
