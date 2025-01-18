package edu.ifma.dcomp.boaspraticas.roteiro06.modelo;

import java.util.Objects;

public class CNPJ implements Documento {

    private String valor;

    public CNPJ(String valor) {
        if(ehValido(valor))
           this.valor = valor;
        else
            throw new IllegalArgumentException("O CNPJ é inválido!" );
    }

    @Override
    public boolean ehValido(String valor) {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }

    @Override
    public String getNumero() {
        return this.valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CNPJ cnpj = (CNPJ) o;
        return Objects.equals(valor, cnpj.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    private boolean segundoDigitoCorreto() {
        return true;
    }

    private boolean segundoDigitoVerificador() {
        return true;
    }

    private boolean primeiroDigitoCorreto() {
        return true;
    }

    private boolean primeiroDigitoVerificador() {
        return true;
    }

}
