package edu.danilotc.maratonajava.introducao.repeticao;

public class Repeticao02DoWhile {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("dentro do do-while " + (++count));
        } while (count < 10);
    }
}
