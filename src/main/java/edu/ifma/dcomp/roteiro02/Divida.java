package edu.ifma.dcomp.roteiro02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class Divida {
    private String credor;

    private CNPJ cnpjCredor;

    private double total;

    private HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();

    public HistoricoPagamentos getHistoricoPagamentos() {
        return historicoPagamentos;
    }

    public void registra(Pagamento pagamento) {
        if ( ehValido(pagamento ) )
            historicoPagamentos.registra(pagamento );
        else
            throw new IllegalArgumentException("Para quitação da dívida, faltam " + this.valorAPagar()
                                  + ", mas foi informado um valor superior de " + pagamento.getValor() );

    }

    private boolean ehValido(Pagamento pagamento) {
        return this.total >= ( historicoPagamentos.getValorPago() + pagamento.getValor() );
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public CNPJ getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(CNPJ cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }



    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + cnpjCredor + '\'' +
                ", total=" + total +
                ", valorPago=" + historicoPagamentos.getValorPago() +
                '}';
    }

    public double valorAPagar() {
        return total - historicoPagamentos.getValorPago();
    }

    public double getValorPago() {
        return historicoPagamentos.getValorPago();
    }
}
