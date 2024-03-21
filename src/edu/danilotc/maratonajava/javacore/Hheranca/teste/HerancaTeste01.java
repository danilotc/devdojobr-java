package edu.danilotc.maratonajava.javacore.Hheranca.teste;

import edu.danilotc.maratonajava.javacore.Hheranca.dominio.Endereco;
import edu.danilotc.maratonajava.javacore.Hheranca.dominio.Funcionario;
import edu.danilotc.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-875");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Madruga");
        pessoa.setCpf("11111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("----------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Florinda");
        funcionario.setCpf("22222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
