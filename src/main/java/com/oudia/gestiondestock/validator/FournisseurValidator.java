package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {

    public List<String> validate(FournisseurDto fournisseurDto) {
        List<String> errors = new ArrayList<>();
        if (fournisseurDto == null) {
            errors.add("Veuillez saisir le nom du fournisseur");
            errors.add("Veuillez saisir le prénom du fournisseur");
            errors.add("Veuillez saisir l'email du fournisseur");
            errors.add("Veuillez saisir le numéro de téléphone du fournisseur");
        } else {
            if (!StringUtils.hasLength(fournisseurDto.getNom())) {
                errors.add("Veuillez saisir le nom du fournisseur");
            }
            if (!StringUtils.hasLength(fournisseurDto.getPrenom())) {
                errors.add("Veuillez saisir le prénom du fournisseur");
            }
            if (!StringUtils.hasLength(fournisseurDto.getMail())) {
                errors.add("Veuillez saisir l'email du fournisseur");
            }
            if (!StringUtils.hasLength(fournisseurDto.getNumTel())) {
                errors.add("Veuillez saisir le numéro de téléphone du fournisseur");
            }
            if (fournisseurDto.getAdresse() == null) {
                errors.add("Veuillez renseigner l'adresse du fournisseur");
            } else {
                if (!StringUtils.hasLength(fournisseurDto.getAdresse().getAdresse1())) {
                    errors.add("Le champs 'Adresse1' est obligatoire");
                }
                if (!StringUtils.hasLength(fournisseurDto.getAdresse().getCodePostale())) {
                    errors.add("Le champs 'code postale' est obligatoire");
                }
                if (!StringUtils.hasLength(fournisseurDto.getAdresse().getVille())) {
                    errors.add("Le champs 'ville' est obligatoire");
                }
                if (!StringUtils.hasLength(fournisseurDto.getAdresse().getPays())) {
                    errors.add("Le champs 'pays' est obligatoire");
                }
            }
        }
        return errors;
    }
}
