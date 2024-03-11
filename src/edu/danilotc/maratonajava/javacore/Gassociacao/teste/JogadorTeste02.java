package edu.danilotc.maratonajava.javacore.Gassociacao.teste;

import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Jogador;
import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Time;

import java.util.Calendar;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        // ao cadastrar o time na instancia do jogador estamos criando uma associacao entre jogador e time
        jogador1.setTime(time);

        // se a associacao foi feita, o jogador estara associado a um time
        jogador1.imprime();
    }
}
