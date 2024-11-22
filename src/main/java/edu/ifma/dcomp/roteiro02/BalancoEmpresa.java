package edu.ifma.dcomp.roteiro02;

import java.time.LocalDate;
import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<String, Divida> dividas = new HashMap<>();

    public void registraDivida(String cnpjCredor, String credor, double valor ) {
        Divida divida = new Divida();
        divida.setCredor(credor );
        divida.setCnpjCredor(cnpjCredor );
        divida.setTotal(valor );

        dividas.put(cnpjCredor, divida );
    }

   public void pagaDivida(String cnpjCredor, double valor, String pagador, LocalDate dataPagamento) {
        Divida divida = dividas.get(cnpjCredor);

        if (divida != null ) {
            Pagamento pagamento = new Pagamento();
            pagamento.setDataPagamento(dataPagamento);
            pagamento.setValor(valor);
            pagamento.setPagador(pagador);

            // divida.getPagamentos().add(pagamento );
            // divida.paga(valor );
            divida.registra(pagamento );

            //divida.setValorPago(divida.getValorPago() + valor);
        } else {
             throw new IllegalArgumentException ("O CNPJ é inválido!!" );
        }
   }



   public Divida carregaDivida(String cnpjCredor ) {
        return dividas.get(cnpjCredor );
   }


}
