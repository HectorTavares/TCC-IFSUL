package com.br.api.domain;

import com.br.api.domain.enumaration.Especie;
import com.br.api.domain.enumaration.Genero;
import com.br.api.domain.enumaration.Porte;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@ToString(of = "id")
@EqualsAndHashCode(of = "id")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private static final String SEQUENCE = "ANIMAL_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
    @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE, allocationSize = 1)
    private Long id;

    private Especie especie;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Enumerated(EnumType.STRING)
    private Porte porte;

    private LocalDate dataDeNascimento;

    private String nome;

    private Boolean isExcluido;

    private String raca;

    private String situacaoVacinal;

    private String caracteristicas;

    @OneToMany()
    @JoinColumn(name = "id_foto", referencedColumnName = "id")
    private List<Foto> fotos;

}
