package br.ucsal.corpoDocente.dto;

public class ProfessorUpdateDTO {
    private String nomeCompleto;

    private Long numeroRegistro;
    private String escolaVinculada;
    private Integer id;
    private Boolean ativo;

    public ProfessorUpdateDTO() {}

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
