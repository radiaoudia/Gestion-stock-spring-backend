package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.LigneCommandeClientDto;
import com.oudia.gestiondestock.dto.LigneCommandeFournisseurDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LigneCommandeFournisseurValidator {
    public List<String> validate(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
        List<String> errors = new ArrayList<>();
        if (ligneCommandeFournisseurDto == null) {
            errors.add("Veuillez sélectionner un article");
            errors.add("Veuillez sélectionner une commande fournisseur");
            errors.add("Veuillez saisir la quantité");
            errors.add(                                                                                                                                                                                                                                                                       "Veuillez saisir le prix unitaire");
        } else {
            if (ligneCommandeFournisseurDto.getArticle() == null) {
                errors.add("Veuillez sélectionner un article");
            }
            if (ligneCommandeFournisseurDto.getCommandeFournisseur() == null) {
                errors.add("Veuillez sélectionner une commande fournisseur");
            }
            if (ligneCommandeFournisseurDto.getQuantite() == null || ligneCommandeFournisseurDto.getQuantite().compareTo(BigDecimal.ZERO) == 0) {
                errors.add("Veuillez saisir la quantité");
            }
            if (ligneCommandeFournisseurDto.getPrixUnitaire() == null || ligneCommandeFournisseurDto.getPrixUnitaire().compareTo(BigDecimal.ZERO) == 0) {
                errors.add("Veuillez saisir le prix unitaire");
            }
        }
        return errors;
    }
}
