package edu.ifma.dcomp.boaspraticas;

import edu.ifma.dcomp.boaspraticas.roteiro02.Divida;
import edu.ifma.dcomp.boaspraticas.roteiro02.Pagamento;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Divida divida = new Divida();
        divida.setTotal(1000 );

        Pagamento pagamento = new Pagamento();
        pagamento.setDataPagamento(LocalDate.now() );
        pagamento.setPagador("Funcionario01");
        pagamento.setValor(300 );

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setDataPagamento(LocalDate.now() );
        pagamento2.setPagador("Funcionario01");
        pagamento2.setValor(800 );

        divida.registra(pagamento );
        divida.registra(pagamento2 );

        System.out.println(divida.getTotal());
        System.out.println(divida.getValorPago() );
        System.out.println(divida.valorAPagar() );
    }
}