package edu.ifma.dcomp.padroes.chainofresponsability;

public class DescontoPorCincoItens {

  public double desconta(Orcamento orcamento) {

    if(orcamento.getItens().size() > 5) {
      return orcamento.getValor() * 0.10;
    }
    else {
      return 0;
    }
  }
}
