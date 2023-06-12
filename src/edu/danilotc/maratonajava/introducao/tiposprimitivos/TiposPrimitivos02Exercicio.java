package edu.danilotc.maratonajava.introducao.tiposprimitivos;

public class TiposPrimitivos02Exercicio {
    public static void main(String[] args) {
        // entrada
        String nome = "João";
        String endereco = "Rua 23 de Setembro";
        double salario = 5320.14D;
        String dataRecebimentoSalario = "12/06/2023"; // dd/MM/aaaa

        // processamento
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;

        // saída
        System.out.println(relatorio);
    }
}
