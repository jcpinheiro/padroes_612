package edu.ifma.dcomp.padroes.chainofresponsability;

public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento) {
    // verifica primeira regra de possível desconto
    if(orcamento.totalDeItens() > 5) {
      return new DescontoPorCincoItens().desconta(orcamento );
    }
     
    // verifica segunda regra de possível desconto
    else if(orcamento.getValor() > 500.0) {
      return new DescontoPorMaisDeQuinhentosReais().desconta(orcamento );
    }

    else if(orcamento.getValor() > 200.0 && orcamento.totalDeItens() > 2) {
      return orcamento.getValor() * 0.05;
    }
     
    // verifica terceira, quarta, quinta regra de
    // possível desconto  ...
    // um monte de ifs daqui pra baixo
    return 0;
  }

  /* public double calcula(Orcamento orcamento) {
    // verifica primeira regra de possível desconto
    if(orcamento.totalDeItens() > 5) {
      return orcamento.getValor() * 0.10;
    }

    // verifica segunda regra de possível desconto
    else if(orcamento.getValor() > 500.0) {
      return orcamento.getValor() * 0.07;
    }

    else if(orcamento.getValor() > 200.0 && orcamento.totalDeItens() > 2) {
      return orcamento.getValor() * 0.05;
    }

    // verifica terceira, quarta, quinta regra de
    // possível desconto  ...
    // um monte de ifs daqui pra baixo
    return 0;
  }*/
}
