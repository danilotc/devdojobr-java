package edu.danilotc.maratonajava.javacore.Bintroducaometodos.teste;

import edu.danilotc.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        pessoa.imprimir();
    }
}
