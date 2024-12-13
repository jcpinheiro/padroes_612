package edu.ifma.dcomp.roteiro05;

public class Divida {
    private String credor;

    private Documento documentoCredor;

    private double total;

    private HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();

    public void registra(Pagamento pagamento) {
        if ( ehValido(pagamento ) )
            historicoPagamentos.registra(pagamento );
        else
            throw new IllegalArgumentException("Para quitação da dívida, faltam " + this.valorAPagar()
                                  + ", mas foi informado um valor superior de " + pagamento.getValor() );
    }

    public Iterable<Pagamento> getPagamentos() {
        return historicoPagamentos.getPagamentos();
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

    public Documento getDocumentoCredor() {
        return documentoCredor;
    }

    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
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
                ", documento='" + documentoCredor + '\'' +
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
