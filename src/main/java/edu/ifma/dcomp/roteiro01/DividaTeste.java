package edu.ifma.dcomp.roteiro01;

public class DividaTeste {

    public static void main(String[] args) {
        Divida divida = new Divida();

        divida.setCredor("Banco do Brasil");
        divida.setCnpjCredor("00.000.000/6789-02");
        divida.setTotal(5000.0);

        divida.setValorPago(3000.00);

        System.out.println(divida );




    }
}
