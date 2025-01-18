package edu.ifma.dcomp.padroes.strategy;

public class TesteCalculadora {

    public static void main(String[] args) {
        Orcamento materialEscolar = new Orcamento(1000);

        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

        calculadora.realizaCalculo(materialEscolar, "ICMS" );
    }
}
