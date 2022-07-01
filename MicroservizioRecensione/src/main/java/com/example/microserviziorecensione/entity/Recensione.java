package com.example.microserviziorecensione.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Recensione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String testo;
    @Column
    private String articolo;
}
