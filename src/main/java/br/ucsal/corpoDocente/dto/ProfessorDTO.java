package br.ucsal.corpoDocente.dto;

public class ProfessorDTO {

    private Integer id;
    private String nomeCompleto;
    private long numeroRegistro;
    private String escolaVinculada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public long getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(long numeroRegistro) {
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

    private boolean ativo = true;
}
