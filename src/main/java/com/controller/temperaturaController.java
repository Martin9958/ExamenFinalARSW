package com.controller;

import com.model.Convertidor;
import com.services.temperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/Temperatura")
public class temperaturaController {

    @Autowired
    temperaturaService temperaturaService;


    @GetMapping("/{numero}/{unidadinicial}/{unidadfinal}")
    public Convertidor getGrados(@PathVariable("numero") double numero, @PathVariable("unidadinicial") String unidadinicial, @PathVariable("unidadfinal") String unidadfinal){
       return temperaturaService.cambioDeTemperatura(unidadinicial,numero,unidadfinal);
    }
}
