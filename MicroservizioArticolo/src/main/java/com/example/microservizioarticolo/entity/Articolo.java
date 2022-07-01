package com.example.microservizioarticolo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Articolo {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;
    @Column
    private Double prezzo;
    @Column
    private String recensioni;
    @Column
    private Long idRecensione;

    public Long getIdRecensione() {
        return idRecensione;
    }

    public void setIdRecensione(Long idRecensione) {
        this.idRecensione = idRecensione;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String getRecensioni() {
        return recensioni;
    }

    public void setRecensioni(String recensioni) {
        this.recensioni = recensioni;
    }
}
