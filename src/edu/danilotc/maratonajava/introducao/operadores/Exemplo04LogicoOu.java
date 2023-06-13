package edu.danilotc.maratonajava.introducao.operadores;

public class Exemplo04LogicoOu {
    public static void main(String[] args) {
        // entrada
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        // processamento
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        // saída
        System.out.println("isPlaystation5Compravel "+isPlaystation5Compravel);
    }
}
