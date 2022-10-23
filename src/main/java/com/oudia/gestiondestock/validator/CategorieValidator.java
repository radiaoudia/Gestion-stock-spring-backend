package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.CategorieDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategorieValidator {
    public static List<String> validate(CategorieDto categorieDto) {
        List<String> errors = new ArrayList<>();
        if (categorieDto == null) {
            errors.add("Veuillez renseigner le code de la catégorie");
            errors.add("Veuillez renseigner la désignation de la catégorie");
        } else {
            if (!StringUtils.hasLength(categorieDto.getCode())) {
                errors.add("Veuillez renseigner le code de la catégorie");
            }
            if (!StringUtils.hasLength(categorieDto.getDesignation())) {
                errors.add("Veuillez renseigner la désignation de la catégorie");
            }
        }
        return errors;
    }
}
