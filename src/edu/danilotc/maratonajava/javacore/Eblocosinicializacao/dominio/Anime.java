package edu.danilotc.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        // Este é o bloco de inicialização de instância (não estático)
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[14];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
