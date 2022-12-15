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
public class Campanha {

    private String titulo;

    private LocalDate dataEncerramento;

    private String descricao;

    private List<String> fotos;

}
