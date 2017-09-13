package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */

/**
 * SETERS faltando, e não representados na documentação.
 * [COMISSÃO]
 */
public class PapelMoeda {
    /**
     * Visibilidade dos atributos não bate com o especificado
     * 
     * [COMISSÃO]
     */

    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
