package edu.danilotc.maratonajava.javacore.Npolimorfismo.servico;

import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Produto: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
