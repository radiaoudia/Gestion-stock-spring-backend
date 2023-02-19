package com.oudia.gestiondestock.repository;

import com.oudia.gestiondestock.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Integer, Categorie> {
}
