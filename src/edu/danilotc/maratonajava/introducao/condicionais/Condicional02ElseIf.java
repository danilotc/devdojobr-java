package edu.danilotc.maratonajava.introducao.condicionais;

public class Condicional02ElseIf {
    public static void main(String[] args) {
        int idade = 17;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        // Não usar operador ternário com mais de uma condição, apesar de possível, não é recomendado.
        // Além disso, a instrução fica difícil de ler, diferente da mesma avaliação implementada acima.
        categoria = idade < 15 ? "Categoria infantil" : idade >= 15 && idade < 18 ? "Categoria juvenil" : "Categorial adulto";

        System.out.println(categoria);
    }
}
