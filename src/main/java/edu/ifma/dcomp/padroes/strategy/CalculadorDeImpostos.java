package edu.ifma.dcomp.padroes.strategy;

public class CalculadorDeImpostos {

  // versao 01
 /* public void realizaCalculo(Orcamento orcamento, String imposto) {

    if (imposto.equalsIgnoreCase("ICMS")) {
      double icms = orcamento.getValor() * 0.10;
      System.out.println(icms);

    } else if (imposto.equalsIgnoreCase("ISS")) {
      double iss = orcamento.getValor() * 0.05;
      System.out.println(iss);

    } else
      throw new IllegalArgumentException("Imposto inválido!!!" );

  }*/ //

  // versao 02
  public void realizaCalculo(Orcamento orcamento, String imposto) {

    if (imposto.equalsIgnoreCase("ICMS")) {
         System.out.println(calculaICMS(orcamento ) );

    } else if (imposto.equalsIgnoreCase("ISS")) {
        System.out.println(calculaISS(orcamento ) );

    } else
      throw new IllegalArgumentException("Imposto inválido!!!" );

  }

  public double calculaICMS(Orcamento orcamento) {
    return orcamento.getValor() * 0.10;
  }

  public double calculaISS(Orcamento orcamento) {
    return orcamento.getValor() * 0.05;
  }
}
