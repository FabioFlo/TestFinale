package com.example.microserviziorecensione.repository;

import com.example.microserviziorecensione.entity.Recensione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecensioneRepository extends JpaRepository<Recensione, Long> {
}
