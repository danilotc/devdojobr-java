package edu.danilotc.maratonajava.javacore.Minterfaces.teste;

import edu.danilotc.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import edu.danilotc.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
