package edu.danilotc.maratonajava.javacore.introducaometodos.teste;

import edu.danilotc.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste06 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();

        // Passando array como argumento
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somarArray(numeros);

        // Passando array como argumento do método definido como varargs
        calculadora.somarVarArgs(1,2,3);
    }
}
