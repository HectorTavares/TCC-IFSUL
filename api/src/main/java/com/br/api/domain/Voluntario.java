package com.br.api.domain;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Voluntario extends Usuario{

    private static final String SEQUENCE = "VOLUNTARIO_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
    @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE, allocationSize = 1)
    private Long id;

    private String cpf;

    @OneToMany
    @JoinColumn(name = "id_ong", referencedColumnName = "id")
    private List<Ong> ongsSeguidas;

    @ManyToMany
    @JoinTable(
            name = "voluntario_interesse",
            joinColumns = @JoinColumn(name = "voluntario_id"),
            inverseJoinColumns = @JoinColumn(name = "interesse_id"))
    private List<Interesse> interesses;
}
