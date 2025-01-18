package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class SemDesconto implements RegraDesconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(RegraDesconto desconto) {
        throw new RuntimeException("Não possui desconto para esse orçamento");
    }
}
