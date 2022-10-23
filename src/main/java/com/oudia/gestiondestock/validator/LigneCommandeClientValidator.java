package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.LigneCommandeClientDto;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LigneCommandeClientValidator {
    public List<String> validate(LigneCommandeClientDto ligneCommandeClientDto) {
        List<String> errors = new ArrayList<>();
        if (ligneCommandeClientDto == null) {
            errors.add("Veuillez sélectionner un article");
            errors.add("Veuillez sélectionner une commande client");
            errors.add("Veuillez saisir la quantité");
            errors.add("Veuillez saisir le prix unitaire");
        } else {
            if (ligneCommandeClientDto.getArticle() == null) {
                errors.add("Veuillez sélectionner un article");
            }
            if (ligneCommandeClientDto.getCommandeClient() == null) {
                errors.add("Veuillez sélectionner une commande client");
            }
            if (ligneCommandeClientDto.getQuantite() == null || ligneCommandeClientDto.getQuantite().compareTo(BigDecimal.ZERO) == 0) {
                errors.add("Veuillez saisir la quantité");
            }
            if (ligneCommandeClientDto.getPrixUnitaire() == null || ligneCommandeClientDto.getPrixUnitaire().compareTo(BigDecimal.ZERO) == 0) {
                errors.add("Veuillez saisir le prix unitaire");
            }
        }
        return errors;
    }
}
