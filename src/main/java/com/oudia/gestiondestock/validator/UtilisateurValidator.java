package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.CategorieDto;
import com.oudia.gestiondestock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public static List<String> validate(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();

        if (utilisateurDto == null) {
            errors.add("Veuillez renseigner le nom de l'utilisateur");
            errors.add("Veuillez renseigner le prénom de l'utilisateur");
            errors.add("Veuillez renseigner la date de naissance de l'utilisateur");
            errors.add("Veuillez renseigner l'email de l'utilisateur");
            errors.add("Veuillez renseigner l'adresse de l'utilisateur");
        } else {
            if (!StringUtils.hasLength(utilisateurDto.getNom())) {
                errors.add("Veuillez renseigner le nom de l'utilisateur");
            }
            if (!StringUtils.hasLength(utilisateurDto.getPrenom())) {
                errors.add("Veuillez renseigner le prénom de l'utilisateur");
            }
            if (!StringUtils.hasLength(utilisateurDto.getDateDeNaissance().toString())) {
                errors.add("Veuillez renseigner la date de naissance de l'utilisateur");
            }
            if (!StringUtils.hasLength(utilisateurDto.getEmail())) {
                errors.add("Veuillez renseigner l'email de l'utilisateur");
            }
            if (utilisateurDto.getAdresse() == null) {
                errors.add("Veuillez renseigner l'adresse de l'utilisateur");
            } else {
                if (!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())) {
                    errors.add("Le champs 'Adresse1' est obligatoire");
                }
                if (!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostale())) {
                    errors.add("Le champs 'code postale' est obligatoire");
                }
                if (!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())) {
                    errors.add("Le champs 'ville' est obligatoire");
                }
                if (!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())) {
                    errors.add("Le champs 'pays' est obligatoire");
                }
            }
        }
        return errors;
    }
}
