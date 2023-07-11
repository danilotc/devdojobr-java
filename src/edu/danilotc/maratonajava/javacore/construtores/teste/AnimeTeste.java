package edu.danilotc.maratonajava.javacore.construtores.teste;

import edu.danilotc.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação");
        anime.imprimir();
    }
}
