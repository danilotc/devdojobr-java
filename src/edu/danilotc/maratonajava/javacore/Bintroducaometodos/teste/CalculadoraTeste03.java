package edu.danilotc.maratonajava.javacore.Bintroducaometodos.teste;

import edu.danilotc.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividirDoisNumeros(20, 2);
        System.out.println(resultado);
    }
}
