package edu.danilotc.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDeTecladoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);
        entrada.close(); // prevents resource leak
        System.out.println("----------------------");
        System.out.println("Nome "+nome);
        System.out.println("Idade "+idade);
        System.out.println("Sexo "+sexo);
    }
}
