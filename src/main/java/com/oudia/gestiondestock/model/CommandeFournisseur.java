package com.oudia.gestiondestock.model;

import lombok.*;
import org.apache.logging.log4j.CloseableThreadContext;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "commande_fournisseur")
public class CommandeFournisseur extends AbstractEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "date_commande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name = "id_fournisseur")
    private Fournisseur fournisseur;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
