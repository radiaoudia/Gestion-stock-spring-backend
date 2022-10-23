package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.VenteDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VenteValidator {
    public List<String> validate(VenteDto venteDto) {
        List<String> errors = new ArrayList<>();
        if (venteDto == null) {
            errors.add("Veuillez saisir le code de la vente");
            errors.add("Veuillez saisir la date de vente");
            errors.add("Veuillez saisir un commentaire");
        } else {
            if (!StringUtils.hasLength(venteDto.getCode())) {
                errors.add("Veuillez saisir le code de la vente");
            }
            if (!StringUtils.hasLength(venteDto.getDateVente().toString())) {
                errors.add("Veuillez saisir la date de vente");
            }
            if (!StringUtils.hasLength(venteDto.getCommentaire())) {
                errors.add("Veuillez saisir un commentaire");
            }
        }
        return errors;
    }
}
