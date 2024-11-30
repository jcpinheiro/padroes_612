package edu.ifma.dcomp.roteiro05;

import java.time.LocalDate;

public class DividaTeste {

    public static void main(String[] args) {

        Pagamento pagamento1 = new Pagamento();
        pagamento1.setDataPagamento(LocalDate.now() );
        pagamento1.setPagador("Funcionarios 01");
        pagamento1.setValor(200 );

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setDataPagamento(LocalDate.now() );
        pagamento2.setPagador("Funcionarios 01");
        pagamento2.setValor(300 );

        Divida divida = new Divida();
        divida.setTotal(1000 );
        divida.setCredor("Banco XPTO" );
        divida.setCnpjCredor(new CNPJ("123.567/0001-23") );

        divida.registra(pagamento1);
        divida.registra(pagamento2);

        Iterable<Pagamento> pagamentos = divida.getPagamentos();

        pagamentos.forEach(pagamento -> System.out.println(pagamento) );
        // pagamentos.remove(pagamento1 );
        System.out.println("----------------------");
        pagamentos.forEach(pagamento -> System.out.println(pagamento) );


    }
}
