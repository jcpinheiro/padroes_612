package edu.ifma.dcomp.roteiro06.modelo;

import java.util.Objects;

public class CPF implements Documento {

    private String valor;

    public CPF(String valor) {
        if(ehValido(valor))
           this.valor = valor;
        else
            throw new IllegalArgumentException("O CPF é inválido!" );
    }
    @Override
    public String getNumero() {
        return valor;
    }

    @Override
    public boolean ehValido(String valor) {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPF cpf = (CPF) o;
        return Objects.equals(valor, cpf.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }
}
