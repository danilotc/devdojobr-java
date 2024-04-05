package edu.danilotc.maratonajava.javacore.Npolimorfismo.servico;

import edu.danilotc.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
