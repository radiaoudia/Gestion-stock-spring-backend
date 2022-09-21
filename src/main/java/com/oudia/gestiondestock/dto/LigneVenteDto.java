package com.oudia.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private Integer id;

    private VenteDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
