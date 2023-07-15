package edu.danilotc.maratonajava.javacore.Aintroducaoclasses.teste;

import edu.danilotc.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        // Cria duas instâncias de Estudante
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        // Muda o valor padrão do atributo nome da instância estudante2
        estudante2.nome = "Chiquinha";

        // Acessa valor do atributo nome de cada instância
        System.out.println(estudante1.nome);
        System.out.println(estudante2.nome);
    }
}
