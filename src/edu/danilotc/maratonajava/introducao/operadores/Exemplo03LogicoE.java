package edu.danilotc.maratonajava.introducao.operadores;

public class Exemplo03LogicoE {
    public static void main(String[] args) {
        // entrada
        int idade = 29;
        float salario = 3500F;

        // processamento
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;

        // saída
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);
    }
}
