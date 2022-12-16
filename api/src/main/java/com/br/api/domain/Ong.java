package com.br.api.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ong extends Usuario{

    private static final String SEQUENCE = "AVASDASALIACAO_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
    @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE, allocationSize = 1)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_foto", referencedColumnName = "id")
    private List<Foto> imagens;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_animal", referencedColumnName = "id")
    private List<Animal> animais;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_campanha", referencedColumnName = "id")
    private List<Campanha> campanhas;
}
