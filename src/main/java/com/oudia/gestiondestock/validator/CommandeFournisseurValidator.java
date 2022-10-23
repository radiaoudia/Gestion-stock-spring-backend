package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.CommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeFournisseurValidator {
    public List<String> validate(CommandeFournisseurDto commandeFournisseurDto) {
        List<String> errors = new ArrayList<>();
        if (commandeFournisseurDto == null) {
            errors.add("Veuillez saisir le code de la commande fournisseur");
            errors.add("Veuillez saisir la date de la commande fournisseur");
            errors.add("Veuillez sélectionner le fournisseur de la commande fournisseur");
            errors.add("Veuillez sélectionner au moins une ligne article");
        } else {
            if (!StringUtils.hasLength(commandeFournisseurDto.getCode())) {
                errors.add("Veuillez saisir le code de la commande fournisseur");
            }
            if (!StringUtils.hasLength(commandeFournisseurDto.getDateCommande().toString())) {
                errors.add("Veuillez saisir la date de la commande fournisseur");
            }
            if (commandeFournisseurDto.getFournisseur() == null) {
                errors.add("Veuillez sélectionner le fournisseur de la commande fournisseur");
            }
            if (commandeFournisseurDto.getLigneCommandeFournisseurs().isEmpty()) {
                errors.add("Veuillez sélectionner au moins une ligne article");
            }
        }
        return errors;
    }
}
