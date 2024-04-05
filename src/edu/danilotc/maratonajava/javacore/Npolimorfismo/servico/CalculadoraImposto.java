package edu.danilotc.maratonajava.javacore.Npolimorfismo.servico;

import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            // Forma 1 - conversão de tipo objeto
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());

            // Formato 2 - conversão de tipo objeto
            // String dataValidade = ((Tomate) produto).getDataDeValidade();
            // System.out.println(dataValidade);

            // Forma 3 - conversão de tipo objeto
            // System.out.println(((Tomate) produto).getDataDeValidade());
        }
    }
}
