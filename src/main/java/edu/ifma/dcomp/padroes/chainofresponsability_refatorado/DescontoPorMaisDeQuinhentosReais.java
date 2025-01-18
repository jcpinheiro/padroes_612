package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class DescontoPorMaisDeQuinhentosReais implements RegraDesconto {

  private RegraDesconto proximo;

  public double desconta(Orcamento orcamento) {

    if(orcamento.getValor() > 500) {
      return orcamento.getValor() * 0.07;
    }
    else {
      return proximo.desconta(orcamento );
    }
  }

  @Override
  public void setProximo(RegraDesconto desconto) {
    this.proximo = desconto;
  }
}
