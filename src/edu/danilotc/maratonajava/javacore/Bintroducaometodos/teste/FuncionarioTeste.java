package edu.danilotc.maratonajava.javacore.Bintroducaometodos.teste;

import edu.danilotc.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Madruga");
        funcionario.setIdade(42);
        // funcionario.setMedia(1500); // Isso não pode acontecer!
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprimir();
    }
}
