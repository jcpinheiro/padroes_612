package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class DescontoPorCincoItens implements RegraDesconto {

  private RegraDesconto proximo;

  public double desconta(Orcamento orcamento) {
    if(orcamento.getItens().size() > 5) {
      return orcamento.getValor() * 0.10;
    }
    else {
      return proximo.desconta(orcamento );
    }
  }

  @Override
  public void setProximo(RegraDesconto desconto) {
      proximo = desconto;
  }
}
