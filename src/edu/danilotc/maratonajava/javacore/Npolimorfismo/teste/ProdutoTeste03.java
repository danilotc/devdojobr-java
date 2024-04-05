package edu.danilotc.maratonajava.javacore.Npolimorfismo.teste;

import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataDeValidade("04/04/2024");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
