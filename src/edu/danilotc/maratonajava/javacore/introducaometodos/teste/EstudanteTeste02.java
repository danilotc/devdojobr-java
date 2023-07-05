package edu.danilotc.maratonajava.javacore.introducaometodos.teste;

import edu.danilotc.maratonajava.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Godinez";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Chiquinha";
        estudante02.idade = 14;
        estudante02.sexo = 'F';

        // Funciona, mas deixa o código com baixa coesão.
        estudante01.imprimir();
        estudante02.imprimir();
    }
}