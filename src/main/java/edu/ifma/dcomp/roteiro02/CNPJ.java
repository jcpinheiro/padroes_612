package edu.ifma.dcomp.roteiro02;

public class CNPJ {

    private String valor;

    public CNPJ(String valor) {
        if(ehValido(valor))
           this.valor = valor;
        else
            throw new IllegalArgumentException("O CNPJ é inválido!" );
    }

    public boolean ehValido(String valor) {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
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
