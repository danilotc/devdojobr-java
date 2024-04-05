package edu.danilotc.maratonajava.javacore.Npolimorfismo.teste;

import edu.danilotc.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import edu.danilotc.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
