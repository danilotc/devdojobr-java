package edu.danilotc.maratonajava.javacore.Minterfaces.teste;

import edu.danilotc.maratonajava.javacore.Minterfaces.dominio.DataLoader;
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

        // Chamando método estático implementado de forma distinta na interface e na classe concreta
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

        // Acessando atributo estático da interface DataLoader a partir dela e das classes concretas que a implementa
        System.out.println("DataLoader.AtributoEstatico => " + DataLoader.MAX_DATA_SIZE);
        System.out.println("DatabaseLoader.AtributoEstatico => " + DatabaseLoader.MAX_DATA_SIZE);
        System.out.println("FileLoader.AtributoEstatico => " + FileLoader.MAX_DATA_SIZE);
    }
}
