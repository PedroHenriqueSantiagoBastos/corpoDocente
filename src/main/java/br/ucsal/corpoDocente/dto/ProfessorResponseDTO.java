package br.ucsal.corpoDocente.dto;


public class ProfessorResponseDTO {

    private String nomeCompleto;
    private long numeroRegistro;
    private String escolaVinculada;
    private int id;
    private boolean ativo = true;

    public ProfessorResponseDTO() {}

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
