package edu.danilotc.maratonajava.javacore.introducaometodos.teste;

import edu.danilotc.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
