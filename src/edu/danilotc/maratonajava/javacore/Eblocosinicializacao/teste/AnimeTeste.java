package edu.danilotc.maratonajava.javacore.Eblocosinicializacao.teste;

import edu.danilotc.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("One Peace");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
