package edu.danilotc.maratonajava.javacore.construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    /**
     * Este é o construtor padrão, devo colocar ele aqui somente se o
     * meu objetivo for criar um objeto sem inicializar os atributos.
     */
    public Anime() {
    }

    /**
     * Este é o construtor sobrecarregado com os parâmetros que devem
     * ser obrigatoriamente informados na criação do objeto.
     */
    public Anime(String nome, String tipo, int episodios, String genero) {
        // Essa sintaxe this() precisa ser a primeira linha executável
        // e só pode ser utilizada dessa forma dentro de contrutores
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
