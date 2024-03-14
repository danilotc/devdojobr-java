package edu.danilotc.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.setNome(nome);
    }

    public Time(String nome, Jogador[] jogadores) {
        this.setNome(nome);
        this.setJogadores(jogadores);
    }

    public void imprime() {
        System.out.println(this.getNome());
        if (jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
