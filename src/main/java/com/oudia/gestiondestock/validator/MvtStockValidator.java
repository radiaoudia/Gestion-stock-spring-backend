package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.MvtStockDto;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MvtStockValidator {
    public List<String> validate(MvtStockDto mvtStockDto) {
        List<String> errors = new ArrayList<>();
        if (mvtStockDto == null) {
            errors.add("Veuillez sélectionner l'article du mouvement de stock");
            errors.add("Veuillez saisir la date du mouvement de stock");
            errors.add("Veuillez saisir la quantité du mouvement de stock");
            errors.add("Veuillez sélectionner le type du mouvement ( entrée ou bien sortie )");
        } else {
            if (mvtStockDto.getArticle() == null) {
                errors.add("Veuillez sélectionner l'article du mouvement de stock");
            }
            if (!StringUtils.hasLength(mvtStockDto.getDateMvt().toString())) {
                errors.add("Veuillez saisir la date du mouvement de stock");
            }
            if (mvtStockDto.getQuantite() == null || mvtStockDto.getQuantite().compareTo(BigDecimal.ZERO) == 0) {
                errors.add("Veuillez saisir la quantité du mouvement de stock");
            }
            if (!StringUtils.hasLength(mvtStockDto.getTypeMvtStk().toString())) {
                errors.add("Veuillez sélectionner le type du mouvement ( entrée ou bien sortie )");
            }
        }
        return errors;
    }
}
