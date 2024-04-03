package edu.danilotc.maratonajava.javacore.Minterfaces.teste;

import edu.danilotc.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import edu.danilotc.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        // Criando instâncias de DatabaseLoader e FileLoader
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        // Chamando método load() assinado na interface e implementado nas classes concretas
        databaseLoader.load();
        fileLoader.load();

        // Chamando método remove() assinado na interface e implementado nas classes concretas
        databaseLoader.remove();
        fileLoader.remove();

        // Chamando método checkPermission() implementado de forma concreta na interface e sobrescrito nas classes concretas
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
