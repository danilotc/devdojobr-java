package edu.danilotc.maratonajava.javacore.Gassociacao.teste;

import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Escola;
import edu.danilotc.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        // cria instancia de professor
        Professor professor1 = new Professor("Jiraya William");
        Professor professor2 = new Professor("Jiraya Breno");

        // cria uma lista de objetos do tipo Professor
        Professor[] professores = {professor1, professor2};

        // cria instancia de escola com todos os professores
        Escola escola = new Escola("Konoha", professores);

        // imprime escola e seus professores
        escola.imprime();
    }
}
