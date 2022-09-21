package com.oudia.gestiondestock.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="categorie")
public class Categorie extends AbstractEntity{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="code")
    private String code;

    @Column(name="designation")
    private String designation;

    @OneToMany(mappedBy = "categorie")
    private List<Article> Articles;
}
