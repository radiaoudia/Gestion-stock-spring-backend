package com.oudia.gestiondestock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mvt_stock")
public class MvtStock extends AbstractEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;

    @Column(name = "date_mvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "type_mvt")
    private TypeMvtStk typeMvtStk;

    @Column(name = "identreprise")
    private Integer idEntreprise;
}
