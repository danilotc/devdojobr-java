package edu.danilotc.maratonajava.javacore.Dconstrutores.teste;

import edu.danilotc.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprimir();
    }
}
