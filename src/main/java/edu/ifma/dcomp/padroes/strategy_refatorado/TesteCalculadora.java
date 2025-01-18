package edu.ifma.dcomp.padroes.strategy_refatorado;

public class TesteCalculadora {

    public static void main(String[] args) {
        Orcamento materialEscolar = new Orcamento(1000);

        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

        calculadora.realizaCalculo(materialEscolar,  new ISS() );
    }
}
