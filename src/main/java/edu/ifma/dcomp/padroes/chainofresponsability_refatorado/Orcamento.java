package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private double valor;
    private List<Item> itens = new ArrayList<>();

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    public double getValor() {
        return valor;
    }

    public int totalDeItens() {
        return itens.size();
    }
}
