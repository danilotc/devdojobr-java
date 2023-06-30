package edu.danilotc.maratonajava.javacore.introducaoclasses.teste;

import edu.danilotc.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        // Cria instâncias (objetos)
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // Inicializa os atributos de cada objeto
        carro1.nome = "Fusca Bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "TG 500";
        carro2.ano = 1968;

        carro1 = carro2;

        // Acessa valores dos atributos
        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
