package com.oudia.gestiondestock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ligne_vente")
public class LigneVente extends AbstractEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_vente")
    private Vente vente;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prix_unitaire")
    private BigDecimal prixUnitaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;

}
