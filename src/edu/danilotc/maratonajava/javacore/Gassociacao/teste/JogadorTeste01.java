package edu.danilotc.maratonajava.javacore.Gassociacao.teste;

import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        //cria tres instancias de jogadores
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        //guardar num array
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        //imprime valores
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
