package edu.danilotc.maratonajava.javacore.introducaometodos.teste;

import edu.danilotc.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Madruga";
        funcionario.idade = 42;
        funcionario.salarios = new double[]{1200, 987.32, 2000};
        funcionario.imprimir();
    }
}
