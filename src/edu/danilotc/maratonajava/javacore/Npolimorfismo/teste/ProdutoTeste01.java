package edu.danilotc.maratonajava.javacore.Npolimorfismo.teste;

import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomade X", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
