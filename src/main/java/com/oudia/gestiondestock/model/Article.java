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
@Table(name="article")
public class Article extends AbstractEntity{

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="code")
    private String code;

    @Column(name="designation")
    private String designation;

    @Column(name="prix_unitaire_ht")
    private BigDecimal prixUnitaireHt;

    @Column(name="taux_tva")
    private BigDecimal tauxTva;

    @Column(name="prix_unitaire_ttc")
    private BigDecimal prixUnitaireTtc;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="id_category")
    private Categorie categorie;

}
