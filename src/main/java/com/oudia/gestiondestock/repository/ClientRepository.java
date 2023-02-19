package com.oudia.gestiondestock.repository;

import com.oudia.gestiondestock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Integer, Client> {
}
