package com.example.microservizioarticolo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "recensione", url = "http://localhost:8084/api/recensione")
public interface RecensioneClient {

    @GetMapping(value = "/getNomeRecensione/[id}")
    String getrecensione(@PathVariable Long id);
}
