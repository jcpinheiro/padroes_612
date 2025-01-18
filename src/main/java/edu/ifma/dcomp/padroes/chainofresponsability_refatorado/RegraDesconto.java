package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public interface RegraDesconto {
    public double desconta(Orcamento orcamento);
    public void setProximo(RegraDesconto desconto);
}
