package edu.ifma.dcomp.roteiro05;

public class CPF {

    private String valor;

    public CPF(String valor) {
        if(ehValido(valor))
           this.valor = valor;
        else
            throw new IllegalArgumentException("O CPF é inválido!" );
    }

    public String getValor() {
        return valor;
    }

    public boolean ehValido(String valor) {
        return true;
    }
}
