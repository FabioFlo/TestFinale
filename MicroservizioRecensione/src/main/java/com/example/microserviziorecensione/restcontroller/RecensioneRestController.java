package com.example.microserviziorecensione.restcontroller;

import com.example.microserviziorecensione.entity.Recensione;
import com.example.microserviziorecensione.service.RecensioneService;
import com.example.microserviziorecensione.util.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/recensione")
public class RecensioneRestController {

    @Autowired
    RecensioneService recensioneService;

    @GetMapping(value = "/getAllRecensioni")
    public List<Recensione> getRecensioni(){
        return recensioneService.findAllRecensioni();
    }

    @GetMapping(value = "/getRecensione/[id}")
    public Recensione getArticolo(@PathVariable Long id){

        return recensioneService.findRecensione(id);
    }

    @PostMapping(value = "/saveRecensione/[id}")
    public MessageResponse saveRecensione(@RequestBody Recensione recensione){
        return recensioneService.saveRecensione(recensione);
    }

    @PutMapping(value = "/updateRecensione/[id}")
    public MessageResponse updateRecensione(@PathVariable Long id){

        return recensioneService.updateRecensione(id);
    }

    @DeleteMapping(value = "/deleteRecensione/[id}")
    public MessageResponse deleteRecensione(@PathVariable Long id){

        return recensioneService.deleteRecensione(id);
    }

    @GetMapping(value = "getNomeRecensione/[id}")
    public String getNomeRecensione(@PathVariable Long id){

        return recensioneService.getNomeRecensione(id);
    }
}
