package com.oudia.gestiondestock.repository;

import com.oudia.gestiondestock.model.MvtStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStockRepository extends JpaRepository<Integer, MvtStock> {
}
