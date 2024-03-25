package edu.danilotc.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    // Apenas para mostrar que uma enumeração pode ser criada dentro da classe,
    // mas criá-la em um arquivo separado, como TipoCliente, é mais organizado.
    public enum TipoPagamento {
        DEBITO, CREDITO
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{nome='" + nome + '\'' +
                ", tipoCliente='" + tipoCliente.getNomeRelatorio() + "\'" +
                ", tipoCliente='" + tipoCliente.getValor() + "\'" +
                ", tipoPagamento='" + tipoPagamento + "\'" +
                '}';
    }
}
