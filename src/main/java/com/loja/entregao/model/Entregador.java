package com.loja.entregao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
@Table(name = "entregadores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entregador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public  String nome;


};
