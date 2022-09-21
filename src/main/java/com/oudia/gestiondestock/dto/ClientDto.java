package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Adresse;
import com.oudia.gestiondestock.model.Client;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class ClientDto {
    private Integer id;

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeClientDto> commandeClients;

    public Client fromEntity(ClientDto clientDto){
        if(clientDto==null){
            return null;
        }

        return Client.builder()
                .id(clientDto.getId())
                .nom(clientDto.getNom())
                .prenom(clientDto.getPrenom())
                .adresse(clientDto.getAdresse())
                .photo(clientDto.getPhoto())
                .mail(clientDto.getMail())
                .numTel(clientDto.getNumTel())
                .build();
    }
    public ClientDto toEntity(Client client){
        if(client==null){
            return null;
        }

        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(client.getAdresse())
                .photo(client.getPhoto())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .build();
    }
}
