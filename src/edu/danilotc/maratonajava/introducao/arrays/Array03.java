package edu.danilotc.maratonajava.introducao.arrays;

public class Array03 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Danilo";
        nomes[1] = "José";
        nomes[2] = "Ana";

        for (int indice = 0; indice < nomes.length; indice++) {
            System.out.println(nomes[indice]);
        }
    }
}
