package edu.ifma.dcomp.padroes.chainofresponsability;

import java.util.ArrayList;

public class Orcamento {

    private double valor;
    private List<Item> itens = new ArrayList<>();

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
