package com.example.microservizioarticolo.dto;

import com.example.microservizioarticolo.entity.Articolo;
import org.springframework.stereotype.Component;

import java.util.List;

public class ArticoloDto {
private String nome;
private String recensioni;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRecensioni() {
        return recensioni;
    }

    public void setRecensioni(String recensioni) {
        this.recensioni = recensioni;
    }
}
