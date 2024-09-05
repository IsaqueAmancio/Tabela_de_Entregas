package com.loja.entregao.service;


import com.loja.entregao.model.Entregador;
import com.loja.entregao.repository.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregadorService {
    @Autowired
    private EntregadorRepository repo;

    public Entregador addEntregador(Entregador entregador){
        return repo.save(entregador);

    }

}
