package edu.danilotc.maratonajava.javacore.Kenum.teste;

import edu.danilotc.maratonajava.javacore.Kenum.dominio.Cliente;
import edu.danilotc.maratonajava.javacore.Kenum.dominio.TipoCliente;
import edu.danilotc.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        // Retorna o valor no parâmetro definido na constante chamada PESSOA_FISICA
        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente1.getNomeRelatorio());

        // Retorna a constante, o tipo do cliente pelo valor do seu parâmetro chamado nomeRelatorio.
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
