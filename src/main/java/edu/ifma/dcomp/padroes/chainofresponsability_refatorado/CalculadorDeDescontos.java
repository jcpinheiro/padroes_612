package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento, RegraDesconto regraDesconto ) {

     return regraDesconto.desconta(orcamento );

  }


}
