package edu.ifma.dcomp.padroes.strategy_refatorado;


public class ICMS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }
}
