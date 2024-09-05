package com.loja.entregao.controller;


import com.loja.entregao.model.Entregador;
import com.loja.entregao.service.EntregadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entregao")
public class EntregadorController {

    @Autowired
    EntregadorService service;

    @PostMapping("/addEntregador")
    public ResponseEntity<Entregador>  addENtregador(@RequestBody Entregador entregador){

        Entregador newEntregador = service.addEntregador(entregador);
        return new ResponseEntity<>(newEntregador, HttpStatus.CREATED);

    }
}
