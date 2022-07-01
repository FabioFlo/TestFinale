package com.example.microservizioarticolo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservizioArticoloApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservizioArticoloApplication.class, args);
    }

}
