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

    private LocalDate dataCriacao;

    private String descricao;

    @OneToMany()
    @JoinColumn(name = "id_foto", referencedColumnName = "id")
    private List<Foto> fotos;

    @ManyToMany
    @JoinTable(
            name = "campanha_interesse",
            joinColumns = @JoinColumn(name = "campanha_id"),
            inverseJoinColumns = @JoinColumn(name = "interesse_id"))
    private List<Interesse> interesses;

    @PrePersist
    public void setDataCriacaoQuandoCriar() {
        this.dataCriacao = LocalDate.now();
    }
}
