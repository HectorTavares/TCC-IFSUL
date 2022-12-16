package com.br.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    private static final String SEQUENCE = "USUARIO_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
    @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE, allocationSize = 1)
    private Long id;

    protected String nome;

    protected String email;

    protected String senha;

    protected String foto;

    protected String telefone;

    @OneToMany
    @JoinColumn(name = "id_avaliacao", referencedColumnName = "id")
    private List<Avaliacao> avaliacoesRecebidas;
}
