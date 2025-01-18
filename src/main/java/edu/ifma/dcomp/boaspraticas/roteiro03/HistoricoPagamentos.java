package edu.ifma.dcomp.boaspraticas.roteiro03;

import java.time.LocalDate;
import java.util.ArrayList;

class HistoricoPagamentos  {

    private double valorPago;

    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

    public void registra(Pagamento pagamento) {
        pagamentos.add(pagamento);
        this.paga(pagamento.getValor() );
    }


    double getValorPago() {
        return valorPago;
    }

    private void paga (double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve maior do que Zero !!");
        }
        this.valorPago = this.valorPago + valor;
    }
    ArrayList<Pagamento> pagamentosAntesDe(LocalDate data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos ) {
            if (pagamento.getDataPagamento().isBefore(data ) ) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos ) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
}

