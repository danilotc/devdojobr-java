package edu.danilotc.maratonajava.javacore.Gassociacao.teste;

import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Aluno;
import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Local;
import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Professor;
import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das reflexoes"); // foi o 1º porque nao tem dependencia
        Aluno aluno = new Aluno("Epcteto", 19);
        Professor professor = new Professor("Aristoteles", "Filosofia");

        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Estudo da Sociologia", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
