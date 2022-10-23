package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.RoleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RoleValidator {
    public List<String> validate(RoleDto roleDto) {
        List<String> errors = new ArrayList<>();
        if (roleDto == null || !StringUtils.hasLength(roleDto.getNomRole())) {
            errors.add("Veuillez saisir le nom du rôle");
        }
        return errors;
    }
}
