package com.oudia.gestiondestock.repository;

import com.oudia.gestiondestock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
