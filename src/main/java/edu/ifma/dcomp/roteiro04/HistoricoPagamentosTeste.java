package edu.ifma.dcomp.roteiro04;

import java.time.LocalDate;

public class HistoricoPagamentosTeste {

    public static void main(String[] args) {

        Pagamento pagamento1 = new Pagamento();
        pagamento1.setDataPagamento(LocalDate.now() );
        pagamento1.setPagador("Funcionarios 01");
        pagamento1.setValor(200 );

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setDataPagamento(LocalDate.now() );
        pagamento2.setPagador("Funcionarios 01");
        pagamento2.setValor(300 );

        HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();

   /*     historicoPagamentos.add(pagamento1 );
        historicoPagamentos.registra(pagamento2 );

        boolean temPagamento = historicoPagamentos.contains(pagamento1);
        System.out.println(temPagamento);
        historicoPagamentos.remove(pagamento1);
        historicoPagamentos.clear();*/

        System.out.println(historicoPagamentos );

    }
}
