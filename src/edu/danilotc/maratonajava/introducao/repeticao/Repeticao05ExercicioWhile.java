package edu.danilotc.maratonajava.introducao.repeticao;

public class Repeticao05ExercicioWhile {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 1000000) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}
