package br.ucsal.corpoDocente.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class ProfessorCreateDTO {

    @NotBlank
    private String nomeCompleto;

    @NotNull
    private Long numeroRegistro;

    @NotBlank
    private String escolaVinculada;

    private boolean ativo = true;

    public ProfessorCreateDTO() {}

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Long getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(Long numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getEscolaVinculada() {
        return escolaVinculada;
    }

    public void setEscolaVinculada(String escolaVinculada) {
        this.escolaVinculada = escolaVinculada;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
