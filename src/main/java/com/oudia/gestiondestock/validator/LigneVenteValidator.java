package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.LigneVenteDto;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidator {
    public List<String> validate(LigneVenteDto ligneVenteDto) {
        List<String> errors = new ArrayList<>();
        if (ligneVenteDto == null) {
            errors.add("Veuillez sélectionner le nom du rôle");
        } else {
            if (ligneVenteDto.getVente() == null) {
                errors.add("Veuillez sélectionner au moins une vente");
            }
            if (ligneVenteDto.getQuantite() == null || ligneVenteDto.getQuantite().compareTo(BigDecimal.ZERO) == 0) {
                errors.add("Veuillez saisir la quantité de la ligne vente");
            }
            if (ligneVenteDto.getPrixUnitaire() == null || ligneVenteDto.getPrixUnitaire().compareTo(BigDecimal.ZERO) == 0) {
                errors.add("Veuillez saisir le prix unitaire de la ligne vente");
            }
        }
        return errors;
    }
}
