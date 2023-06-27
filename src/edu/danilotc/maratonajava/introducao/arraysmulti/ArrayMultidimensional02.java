package edu.danilotc.maratonajava.introducao.arraysmulti;

public class ArrayMultidimensional02 {
    public static void main(String[] args) {
        // Inicialização 1, iteração com for-each (não é objeto)
        int[] array = {1, 2, 3};
        for(int numero : array) {
            System.out.print(numero);
        }
        System.out.println();

        // Inicialização 2, iteração com for-each (não é objeto)
        int[][] array2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
        for(int[] arrayBase : array2) {
            for(int numero : arrayBase) {
                System.out.print(numero);
            }
            System.out.print(" ");
        }
        System.out.println();

        // Inicialização 3, iteração com for-each (é objeto)
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];
        for (int[] arrayBase : arrayInt) {
            for (int numero : arrayBase) {
                System.out.print(numero);
            }
            System.out.print(" ");
        }
    }
}
