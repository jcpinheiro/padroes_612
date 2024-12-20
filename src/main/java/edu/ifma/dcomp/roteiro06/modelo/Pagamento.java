package edu.ifma.dcomp.roteiro06.modelo;

import java.time.LocalDate;

public class Pagamento {
    private String pagador;
    private LocalDate dataPagamento;
    private double valor;

    public Pagamento() {

    }

    public Pagamento(String pagador, LocalDate dataPagamento, double valor) {
        this.pagador = pagador;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "pagador='" + pagador + '\'' +
                ", dataPagamento=" + dataPagamento +
                ", valor=" + valor +
                '}';
    }
}
