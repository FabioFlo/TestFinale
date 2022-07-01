package com.example.microservizioarticolo.repository;

import com.example.microservizioarticolo.entity.Articolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticoloRepository extends JpaRepository<Articolo,Long> {

}
