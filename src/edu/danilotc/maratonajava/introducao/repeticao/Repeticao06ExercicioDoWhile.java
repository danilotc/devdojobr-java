package edu.danilotc.maratonajava.introducao.repeticao;

public class Repeticao06ExercicioDoWhile {
    public static void main(String[] args) {
        int count = 0;
        do {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        } while(count <= 1000000);
    }
}
