package com.br.api.domain;

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
public class Campanha {

    private static final String SEQUENCE = "CAMPANHA_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
    @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE, allocationSize = 1)
    private Long id;

    private String titulo;

    private LocalDate dataEncerramento;

    private String descricao;

    @OneToMany()
    @JoinColumn(name = "id_foto", referencedColumnName = "id")
    private List<Foto> fotos;

    @ManyToMany()
    @JoinTable(
            name = "interesse_campanha",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Interesse> interesses;

}
