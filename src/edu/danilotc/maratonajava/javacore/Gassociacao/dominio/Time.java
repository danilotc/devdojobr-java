package edu.danilotc.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;

    // Para tornar o atributo 'time' obrigatório utiliza-se o construtor,
    // se adicionar ao construtor será obrigatório, do contrário, não.
    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
