package edu.ifma.dcomp.roteiro05;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class RelatorioDeDividasTeste {

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
        divida.setDocumentoCredor(new CNPJ("123.567/0001-23") );

        divida.registra(pagamento1);
        divida.registra(pagamento2);

        RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
        relatorioDeDivida.geraRelatorio(NumberFormat
                                        .getCurrencyInstance(new Locale("pt", "BR")));


    }
}
