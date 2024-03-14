package edu.danilotc.maratonajava.javacore.Gassociacao.teste;

import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Jogador;
import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        // cria instancia de jogador e time
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");

        // cria lista de objetos do tipo Jogador
        Jogador[] jogadores = {jogador1, jogador2};

        // associa time ao jogador
        jogador1.setTime(time);
        jogador2.setTime(time);

        // associa lista de jogadores ao time
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
