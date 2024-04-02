package edu.danilotc.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando os dados de um banco de dados");
    }
}
