package edu.danilotc.maratonajava.javacore.construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

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

    /**
     * Este construtor instancia um objeto com todos os valores para seus atributos
     * usando a sintaxe this(par1, par2, par3, par4) para inicializar os quatro
     * primeiros atributos da classe a partir de outra sobrecarga.
     * <p>
     * A quantidade de parâmetros dentro do this() indica exatamente qual construtor
     * deverá ser chamado e o compilador chamará a sobrecarga correta.
     */
    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
