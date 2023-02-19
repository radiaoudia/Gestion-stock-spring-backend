package com.oudia.gestiondestock.model;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "role")
public class Role extends AbstractEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nom_role")
    private String nomRole;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;

    @Column(name = "identreprise")
    private Integer idEntreprise;
}
