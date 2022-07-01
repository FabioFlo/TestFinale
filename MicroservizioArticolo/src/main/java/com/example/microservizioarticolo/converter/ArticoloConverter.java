package com.example.microservizioarticolo.converter;

import com.example.microservizioarticolo.dto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ArticoloConverter {
    public List<ArticoloDto> converterCorso(List<Articolo> articoli){

        List<ArticoloDto> listaDto = new ArrayList<>();

        for (Articolo articolo: articoli) {

            ArticoloDto aDto= new ArticoloDto();
            aDto.setNome(articolo.getNome());
            aDto.setRecensioni(articolo.getRecensioni());
            listaDto.add(aDto);
        }
        return listaDto;
    }
}
