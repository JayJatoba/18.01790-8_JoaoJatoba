package br.maua.model;

import br.maua.enumeracoes.Status;

public class Jogo {
    private String plataforma;
    private String nome;
    private Status status;

    public Jogo(String plataforma, String nome) {
        this.plataforma=plataforma;
        this.nome=nome;
        this.status=Status.NAO_INICIADO;
    }

    @Override
    public String toString() {
        return "Jogo: [" + nome + ", plataforma=" + plataforma + ", status=" + status + "]";
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public void setStatusJogando() {
        this.status = Status.JOGANDO;
    }
}
	