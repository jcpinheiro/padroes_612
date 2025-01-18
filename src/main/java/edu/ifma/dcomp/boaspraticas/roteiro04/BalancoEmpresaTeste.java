package edu.ifma.dcomp.boaspraticas.roteiro04;

import java.time.LocalDate;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {
        BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        Divida divida1 = new Divida();
        divida1.setCredor("Banco XPTO");
        divida1.setCnpjCredor(new CNPJ("26.462.376/0001-01" ) );
        divida1.setTotal(1000);

        balancoEmpresa.registraDivida(divida1 );

        balancoEmpresa.pagaDivida("26.462.376/0001-01", new Pagamento("Empresa xyz", LocalDate.now(), 200 ));
        balancoEmpresa.pagaDivida("26.462.376/0001-01", new Pagamento("Empresa xyz", LocalDate.now(), 300 ));

        Divida divida = balancoEmpresa.carregaDivida("26.462.376/0001-01");

        System.out.println(divida );

    }
}
