package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class AdresseDto {
    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostale;

    private String pays;

    public AdresseDto fromEntity(Adresse adresse) {
        if (adresse == null) {
            return null;
        }
        return AdresseDto
                .builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostale(adresse.getCodePostale())
                .ville(adresse.getVille())
                .pays(adresse.getPays())
                .build();
    }

    public Adresse toEntity(AdresseDto adresseDto) {
        if (adresseDto == null) {
            return null;
        }

        return Adresse.builder()
                .adresse1(adresseDto.getAdresse1())
                .adresse2(adresseDto.getAdresse2())
                .codePostale(adresseDto.getCodePostale())
                .ville(adresseDto.getVille())
                .pays(adresseDto.getPays())
                .build();
    }
}
