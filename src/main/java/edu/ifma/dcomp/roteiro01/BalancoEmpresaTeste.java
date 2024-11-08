package edu.ifma.dcomp.roteiro01;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {
        BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        balancoEmpresa.registraDivida("26.462.376/0001-01", "Banco XPTO", 1000);

        balancoEmpresa.pagaDivida("26.462.376/0001-01", 200 );
        balancoEmpresa.pagaDivida("26.462.376/0001-01", 300 );

        Divida divida = balancoEmpresa.carregaDivida("26.462.376/0001-01");

        System.out.println(divida);

    }
}
