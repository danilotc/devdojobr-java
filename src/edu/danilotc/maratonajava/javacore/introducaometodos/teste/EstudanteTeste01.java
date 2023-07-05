package edu.danilotc.maratonajava.javacore.introducaometodos.teste;

import edu.danilotc.maratonajava.javacore.introducaometodos.dominio.Estudante;
import edu.danilotc.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Godinez";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Chiquinha";
        estudante02.idade = 14;
        estudante02.sexo = 'F';

        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
        System.out.println("----------");
        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
    }
}
