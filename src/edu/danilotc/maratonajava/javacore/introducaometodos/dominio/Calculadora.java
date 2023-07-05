package edu.danilotc.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(20 - 2);
    }

    public void multiplicarDoisNumeros(int numero1, float numero2) {
        System.out.println(numero1 * numero2);
    }

    public double dividirDoisNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            return 0;
        }
        return numero1 / numero2;
    }
}
