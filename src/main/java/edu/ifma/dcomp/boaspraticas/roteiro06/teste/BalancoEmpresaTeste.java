package edu.ifma.dcomp.boaspraticas.roteiro06.teste;

import edu.ifma.dcomp.boaspraticas.roteiro06.repositorio.BancoDeDados;
import edu.ifma.dcomp.boaspraticas.roteiro06.modelo.BalancoEmpresa;
import edu.ifma.dcomp.boaspraticas.roteiro06.modelo.CNPJ;
import edu.ifma.dcomp.boaspraticas.roteiro06.modelo.Divida;
import edu.ifma.dcomp.boaspraticas.roteiro06.modelo.Pagamento;
import edu.ifma.dcomp.boaspraticas.roteiro06.repositorio.ArquivoDeDividas;

import java.time.LocalDate;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados("servidor", "usuario", "senha");
        ArquivoDeDividas arquivoDividas = new ArquivoDeDividas();

        BalancoEmpresa balancoEmpresa = new BalancoEmpresa(arquivoDividas );

        Divida divida1 = new Divida();
        divida1.setCredor("Banco XPTO");
        divida1.setDocumentoCredor(new CNPJ("26.462.376/0001-01" ) );
        divida1.setTotal(1000);

        balancoEmpresa.registraDivida(divida1 );

        balancoEmpresa.pagaDivida(new CNPJ("26.462.376/0001-01"), new Pagamento("Empresa xyz", LocalDate.now(), 200 ));
        balancoEmpresa.pagaDivida(new CNPJ("26.462.376/0001-01"), new Pagamento("Empresa xyz", LocalDate.now(), 300 ));

        Divida divida = balancoEmpresa.carregaDivida(new CNPJ("26.462.376/0001-01") );
        bd.desconecta();

        System.out.println(divida );

    }
}
