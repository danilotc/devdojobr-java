package edu.danilotc.maratonajava.javacore.Bintroducaometodos.teste;

import edu.danilotc.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero1 = 1;
        int numero2 = 2;
        calculadora.alterarDoisNumeros(numero1, numero2);
        System.out.println("Dentro do CalculadoraTeste05");
        System.out.println("Numero1 = " + numero1);
        System.out.println("Numero2 = " + numero2);
    }
}
