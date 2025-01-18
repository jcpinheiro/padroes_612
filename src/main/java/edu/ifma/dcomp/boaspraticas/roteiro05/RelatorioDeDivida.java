package edu.ifma.dcomp.boaspraticas.roteiro05;

import java.text.NumberFormat;

public class RelatorioDeDivida {
 
  private Divida divida;

    public RelatorioDeDivida(Divida divida) {
        this.divida = divida;
    }

    public void geraRelatorio(NumberFormat formatadorDeNumero) {
     System.out.println("Credor: " + divida.getCredor());
     System.out.println("Cnpj credor: " + divida.getDocumentoCredor());
 
    // NumberFormat formatadorDeNumero = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    // NumberFormat formatadorDeNumero = NumberFormat.getCurrencyInstance(Locale.UK );


    // agora utilizamos uma instância da classe NumberFormat 
    // para fazer a exibição dos valores      
      System.out.println("Valor a pagar: " + formatadorDeNumero.format(divida.valorAPagar()) );
      System.out.println("Valor total: "   + formatadorDeNumero.format(divida.getTotal()));
    }
}
