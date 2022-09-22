package com.oudia.gestiondestock.validator;

import com.oudia.gestiondestock.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(ClientDto clientDto){
        List<String> errors=new ArrayList<>();

        if(!StringUtils.hasLength(clientDto.getNom())){
           errors.add("Veuillez renseigner le nom du client") ;
        }
        return errors;
    }
}
