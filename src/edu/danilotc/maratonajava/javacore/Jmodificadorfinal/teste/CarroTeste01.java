package edu.danilotc.maratonajava.javacore.Jmodificadorfinal.teste;

import edu.danilotc.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import edu.danilotc.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import edu.danilotc.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Girafales");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Portofino");
        ferrari.imprime();
    }
}
