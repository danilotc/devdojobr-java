package edu.danilotc.maratonajava.javacore.Fmodificadorestatico.teste;

import edu.danilotc.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        /* Todas as instâncias de carro agora terão o valor 180 associado ao atributo
         * estático que define o limite de velocidade de cada objeto. Além disso, está
         * definido dessa forma porque falta criar o método assessor "set". */
        Carro.velocidadeLimite = 180;

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
