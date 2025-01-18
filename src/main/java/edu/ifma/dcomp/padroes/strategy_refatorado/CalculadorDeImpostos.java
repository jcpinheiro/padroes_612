package edu.ifma.dcomp.padroes.strategy_refatorado;

public class CalculadorDeImpostos {


  public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
      double valorImposto = imposto.calcula(orcamento ) ;
      System.out.println(valorImposto );
  }

}
