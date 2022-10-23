package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public List<String> validate(EntrepriseDto entrepriseDto) {
        List<String> errors = new ArrayList<>();
        if (entrepriseDto == null) {
            errors.add("Veuillez saisir le nom de l'entreprise");
            errors.add("Veuillez saisir la description de l'entreprise");
            errors.add("Veuillez saisir la code fiscal de l'entreprise");
            errors.add("Veuillez saisir l'email de l'entreprise");
            errors.add("Veuillez saisir le numéro de téléphone fiscal de l'entreprise");
            errors.add("Veuillez saisir le site web de l'entreprise");

        } else {
            if (!StringUtils.hasLength(entrepriseDto.getNom())) {
                errors.add("Veuillez saisir le nom de l'entreprise");
            }
            if (!StringUtils.hasLength(entrepriseDto.getDescription())) {
                errors.add("Veuillez saisir la description de l'entreprise");
            }
            if (!StringUtils.hasLength(entrepriseDto.getCodeFiscal())) {
                errors.add("Veuillez saisir la code fiscal de l'entreprise");
            }
            if (!StringUtils.hasLength(entrepriseDto.getEmail())) {
                errors.add("Veuillez saisir l'email de l'entreprise");
            }
            if (!StringUtils.hasLength(entrepriseDto.getNumTel())) {
                errors.add("Veuillez saisir le numéro de téléphone fiscal de l'entreprise");
            }
            if (!StringUtils.hasLength(entrepriseDto.getSiteWeb())) {
                errors.add("Veuillez saisir le site web de l'entreprise");
            }
            if (entrepriseDto.getAdresse() == null) {
                errors.add("Veuillez renseigner l'adresse de l'utilisateur");
            } else {
                if (!StringUtils.hasLength(entrepriseDto.getAdresse().getAdresse1())) {
                    errors.add("Le champs 'Adresse1' est obligatoire");
                }
                if (!StringUtils.hasLength(entrepriseDto.getAdresse().getCodePostale())) {
                    errors.add("Le champs 'code postale' est obligatoire");
                }
                if (!StringUtils.hasLength(entrepriseDto.getAdresse().getVille())) {
                    errors.add("Le champs 'ville' est obligatoire");
                }
                if (!StringUtils.hasLength(entrepriseDto.getAdresse().getPays())) {
                    errors.add("Le champs 'pays' est obligatoire");
                }
            }
        }
        return errors;
    }
}
