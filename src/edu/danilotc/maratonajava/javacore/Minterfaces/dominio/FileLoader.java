package edu.danilotc.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando os dados de um arquivo");
    }
}
