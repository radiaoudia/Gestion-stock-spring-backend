package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.CommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {
    public List<String> validate(CommandeClientDto commandeClientDto) {
        List<String> errors = new ArrayList<>();
        if (commandeClientDto == null) {
            errors.add("Veuillez saisir le code de la commande client");
            errors.add("Veuillez saisir la date de la commande client");
            errors.add("Veuillez sélectionner le client de la commande client");
            errors.add("Veuillez sélectionner au moins une ligne article");
        } else {
            if (!StringUtils.hasLength(commandeClientDto.getCode())) {
                errors.add("Veuillez saisir le code de la commande client");
            }
            if (!StringUtils.hasLength(commandeClientDto.getDateCommande().toString())) {
                errors.add("Veuillez saisir la date de la commande client");
            }
            if (commandeClientDto.getClient() == null) {
                errors.add("Veuillez sélectionner le client de la commande client");
            }
            if (commandeClientDto.getLigneCommandeClients().isEmpty()) {
                errors.add("Veuillez sélectionner au moins une ligne article");
            }
        }
        return errors;
    }
}
