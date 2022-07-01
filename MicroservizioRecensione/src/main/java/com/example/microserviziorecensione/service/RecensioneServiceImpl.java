package com.example.microserviziorecensione.service;

import com.example.microserviziorecensione.entity.Recensione;
import com.example.microserviziorecensione.repository.RecensioneRepository;
import com.example.microserviziorecensione.util.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecensioneServiceImpl implements RecensioneService{

    @Autowired
    private RecensioneRepository recensioneRepository;

    @Override
    public Recensione findRecensione(Long id) {
        Recensione recensione = recensioneRepository.findById(id).orElseThrow();
        return recensione;
    }

    @Override
    public List<Recensione> findAllRecensioni() {
        List<Recensione> recensioni = recensioneRepository.findAll();
        return recensioni;
    }

    @Override
    public MessageResponse saveRecensione(Recensione recensione) {
        recensioneRepository.save(recensione);
        return new MessageResponse("recensione salvata",true);
    }

    @Override
    public MessageResponse deleteRecensione(Long id) {
        Recensione recensione = recensioneRepository.findById(id).orElseThrow();
        recensioneRepository.delete(recensione);
        return new MessageResponse("recensione eliminata",true);
    }

    @Override
    public MessageResponse updateRecensione(Long id) {
        Recensione recensione = recensioneRepository.findById(id).orElseThrow();
        saveRecensione(recensione);
        return new MessageResponse("recensione modificata",true);
    }

    @Override
    public String getNomeRecensione(Long id) {
        Recensione recensione = recensioneRepository.findById(id).orElseThrow();
        return recensione.getArticolo() + " " + recensione.getTesto();
    }
}
