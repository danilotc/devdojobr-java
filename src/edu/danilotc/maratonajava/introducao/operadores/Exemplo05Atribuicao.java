package edu.danilotc.maratonajava.introducao.operadores;

public class Exemplo05Atribuicao {
    public static void main(String[] args) {
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
