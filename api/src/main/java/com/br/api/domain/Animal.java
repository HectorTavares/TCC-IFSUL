package com.br.api.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    private Especie especie;

    private String genero; //enum?

    private String porte; //enum??

    private LocalDate dataDeNascimento;

    private String nome;

    private String raca;

    private String vacina; //situacaoVacinal??

    private String caracteristicas;

    private List<String> fotos;

}
