package com.oudia.gestiondestock.repository;

import com.oudia.gestiondestock.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Integer, Vente> {
}
