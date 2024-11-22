package edu.ifma.dcomp.roteiro02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class Divida {
    private String credor;
    private String cnpjCredor;

    private double total;
    private double valorPago;

    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

/*    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }*/

    public void registra(Pagamento pagamento) {
        pagamentos.add(pagamento);
        this.paga(pagamento.getValor() );
    }

/*    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }*/

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public String getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(String cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorPago() {
        return valorPago;
    }

    private void paga (double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve maior do que Zero !!");
        }
        this.valorPago = this.valorPago + valor;
    }

    public boolean cnpjValido() {
        return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
                && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }

    private boolean segundoDigitoCorretoParaCnpj() {
        return true;
    }

    private boolean segundoDigitoVerificadorDoCnpj() {
        return true;
    }

    private boolean primeiroDigitoCorretoParaCnpj() {
        return true;
    }

    private boolean primeiroDigitoVerificadorDoCnpj() {
        return true;
    }

    public ArrayList<Pagamento> pagamentosAntesDe(LocalDate data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getDataPagamento().isBefore(data ) ) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }


    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + cnpjCredor + '\'' +
                ", total=" + total +
                ", valorPago=" + valorPago +
                '}';
    }
}
