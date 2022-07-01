package com.example.microservizioarticolo.restcontroller;

import com.example.microservizioarticolo.client.RecensioneClient;
import com.example.microservizioarticolo.dto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import com.example.microservizioarticolo.service.ArticoloService;
import com.example.microservizioarticolo.util.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="api/articolo")
public class ArticoloRestController {

    @Autowired
    ArticoloService articoloService;

    @Autowired
    RecensioneClient recensioneClient;

    @GetMapping(value = "/getAllArticoli")
    public List<ArticoloDto> getAllArticoli(){
        return articoloService.findAllArticoli();
    }

    @GetMapping(value = "/getArticolo/[id}")
    public Articolo getArticolo(@PathVariable Long id){
        return articoloService.findArticolo(id);
    }

    @PostMapping(value = "/saveArticolo/[id}")
    public MessageResponse saveArticolo(@RequestBody Articolo articolo, @PathVariable Long idRecensione){
        String recensione = recensioneClient.getrecensione(idRecensione);
        articolo.setRecensioni(recensione);
        return articoloService.saveArticolo(articolo);
    }

    @PutMapping(value = "/updateArticolo/[id}")
    public MessageResponse updateArticolo(@PathVariable Long id){
        return articoloService.updateArticolo(id);
    }

    @DeleteMapping(value = "/deleteArticolo/[id}")
    public MessageResponse deleteArticolo(@PathVariable Long id){
        return articoloService.deleteArticolo(id);
    }

}
