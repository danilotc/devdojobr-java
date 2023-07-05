package edu.danilotc.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        imprimirMediaSalarial();
    }

    public void imprimirMediaSalarial() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }
}
