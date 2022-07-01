package com.example.microservizioarticolo.service;

import com.example.microservizioarticolo.dto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import com.example.microservizioarticolo.util.MessageResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticoloService {

    Articolo findArticolo(Long id);

    List<ArticoloDto> findAllArticoli();

    MessageResponse saveArticolo(Articolo articolo);

    MessageResponse deleteArticolo(Long id);

    MessageResponse updateArticolo(Long id);
}
