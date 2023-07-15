package edu.danilotc.maratonajava.javacore.Aintroducaoclasses.teste;

import edu.danilotc.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        // Cria instância da classe Professor
        Professor professor = new Professor();

        // Inicializa atributos da instância
        professor.nome = "Girafales";
        professor.idade = 42;
        professor.sexo = 'M';

        // Acessa valores dos atributos
        System.out.println(professor.nome +" "+ professor.idade +" "+ professor.sexo);
    }
}
