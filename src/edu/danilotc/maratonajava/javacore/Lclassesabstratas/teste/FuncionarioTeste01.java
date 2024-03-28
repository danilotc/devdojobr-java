package edu.danilotc.maratonajava.javacore.Lclassesabstratas.teste;

import edu.danilotc.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import edu.danilotc.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import edu.danilotc.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Florinda", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Chaves", 2000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
