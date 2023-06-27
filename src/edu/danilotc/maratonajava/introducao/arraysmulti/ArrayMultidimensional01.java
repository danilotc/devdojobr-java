package edu.danilotc.maratonajava.introducao.arraysmulti;

public class ArrayMultidimensional01 {
    public static void main(String[] args) {
        int[][] dias = new int[4][3];

        dias[0][0] = 31; // janeiro
        dias[0][1] = 28; // fevereiro
        dias[0][2] = 31; // março

        dias[1][0] = 30; // abril
        dias[1][1] = 31; // maio
        dias[1][2] = 30; // junho

        dias[2][0] = 31; // julho
        dias[2][1] = 31; // agosto
        dias[2][2] = 30; // setembro

        dias[3][0] = 31; // outubro
        dias[3][1] = 30; // novembro
        dias[3][2] = 31; // dezembro

        for (int linha = 0; linha < dias.length; linha++)
        {
            for (int coluna = 0; coluna < dias[linha].length; coluna++)
            {
                System.out.println(dias[linha][coluna]);
            }
            System.out.println("---");
        }

        for (int[] arrayBase : dias) {
            for (int numero : arrayBase) {
                System.out.println(numero);
            }
        }
    }
}
