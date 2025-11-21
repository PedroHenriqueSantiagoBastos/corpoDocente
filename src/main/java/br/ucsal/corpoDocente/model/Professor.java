package br.ucsal.corpoDocente.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(unique = true)
    @Serial
    private long numeroRegistro;

    @Column(nullable = false)
    private String escolaVinculada;

    private boolean ativo = true;
}
