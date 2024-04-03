package edu.danilotc.maratonajava.javacore.Npolimorfismo.servico;

import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getValor());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);

    }
}
