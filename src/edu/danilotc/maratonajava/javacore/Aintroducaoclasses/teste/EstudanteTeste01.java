package edu.danilotc.maratonajava.javacore.Aintroducaoclasses.teste;

import edu.danilotc.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        // Cria instância da classe Estudante
        Estudante estudante = new Estudante();

        // Inicializa atributos
        estudante.nome = "Jaiminho";
        estudante.idade = 53;
        estudante.sexo = 'M';

        // Acessa valores atribuídos aos atributos
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante); // mostra endereço de memória
    }
}
