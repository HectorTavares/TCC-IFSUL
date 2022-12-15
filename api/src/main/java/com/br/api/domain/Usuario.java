package com.br.api.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {


    protected String nome;

    protected String email;

    protected String senha;

    protected String foto;

    protected String telefone;

}
