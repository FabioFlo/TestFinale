package com.example.microserviziorecensione.service;

import com.example.microserviziorecensione.entity.Recensione;
import com.example.microserviziorecensione.util.MessageResponse;

import java.util.List;

public interface RecensioneService {

    Recensione findRecensione(Long id);

    List<Recensione> findAllRecensioni();

    MessageResponse saveRecensione(Recensione recensione);

    MessageResponse deleteRecensione(Long id);

    MessageResponse updateRecensione(Long id);

    String getNomeRecensione(Long id);
}
