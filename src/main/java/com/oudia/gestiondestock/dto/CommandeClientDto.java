package com.oudia.gestiondestock.dto;

import com.oudia.gestiondestock.model.Client;
import com.oudia.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {
    private Integer id;

    private String code;

    private Instant dateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;

    public CommandeClient fromEntity(CommandeClientDto commandeClientDto){
        if(commandeClientDto==null){
            return null;
        }

        return CommandeClient.builder()
                .id(commandeClientDto.getId())
                .code(commandeClientDto.getCode())
                .dateCommande(commandeClientDto.getDateCommande())
                .client(commandeClientDto.getClient().fromEntity(commandeClientDto.getClient()))
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
