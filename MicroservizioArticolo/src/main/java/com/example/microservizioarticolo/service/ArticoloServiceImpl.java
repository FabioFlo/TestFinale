package com.example.microservizioarticolo.service;

import com.example.microservizioarticolo.converter.ArticoloConverter;
import com.example.microservizioarticolo.dto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import com.example.microservizioarticolo.repository.ArticoloRepository;
import com.example.microservizioarticolo.util.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticoloServiceImpl implements ArticoloService {

    @Autowired
    private ArticoloRepository articoloRepository;

    @Autowired
    private ArticoloConverter articoloConverter;

    @Override
    public Articolo findArticolo(Long id) {
        Articolo articolo = articoloRepository.findById(id).orElseThrow();
        return articolo;
    }

    @Override
    public List<ArticoloDto> findAllArticoli() {
        List<Articolo> articoli = articoloRepository.findAll();
        return articoloConverter.converterCorso(articoli);
    }

    @Override
    public MessageResponse saveArticolo(Articolo articolo) {
        articoloRepository.save(articolo);
        return new MessageResponse("Articolo salvato", true);
    }

    @Override
    public MessageResponse deleteArticolo(Long id) {
        Articolo articolo = articoloRepository.findById(id).orElseThrow();
        articoloRepository.delete(articolo);
        return new MessageResponse("Articolo eliminato", true);

    }

    @Override
    public MessageResponse updateArticolo(Long id) {
     Articolo articolo = articoloRepository.findById(id).orElseThrow();
     saveArticolo(articolo);
        return new MessageResponse("Articolo modificato", true);

    }
}
