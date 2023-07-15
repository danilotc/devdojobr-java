package edu.danilotc.maratonajava.javacore.Csobrecargametodos.teste;

import edu.danilotc.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akurama Drive", "TV", 12, "Ação");
        anime.imprimir();
    }
}
