package edu.danilotc.maratonajava.javacore.Npolimorfismo.teste;

import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomade X", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
