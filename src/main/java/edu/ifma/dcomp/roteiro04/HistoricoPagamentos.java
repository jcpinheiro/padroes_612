package edu.ifma.dcomp.roteiro04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class HistoricoPagamentos  {

    private double valorPago;

    private List<Pagamento> pagamentos = new ArrayList<>();

    public void registra(Pagamento pagamento) {
        pagamentos.add(pagamento);
        this.paga(pagamento.getValor() );
    }

    List<Pagamento> getPagamentos() {
        return pagamentos;
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
    List<Pagamento> pagamentosAntesDe(LocalDate data) {
        List<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos ) {
            if (pagamento.getDataPagamento().isBefore(data ) ) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    List<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        List<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos ) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
}

