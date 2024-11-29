package edu.ifma.dcomp.roteiro03;

import java.time.LocalDate;
import java.util.ArrayList;

class HistoricoPagamentosHeranca extends ArrayList<Pagamento> {

    private double valorPago;

    // private ArrayList<Pagamento> pagamentos = new ArrayList<>();

    public void registra(Pagamento pagamento) {
        add(pagamento);
        this.paga(pagamento.getValor() );
    }

    @Override
    public boolean add(Pagamento pagamento) {
        registra(pagamento );
        return true;
    }

    @Override
    public boolean remove(Object o) {
       throw new UnsupportedOperationException("Não é possível remover um pagamento ");
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
        for (Pagamento pagamento : this ) {
            if (pagamento.getDataPagamento().isBefore(data ) ) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this ) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
}

