package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class TesteCalculadoraDeDesconto {

    public static void main(String[] args) {


        Orcamento materialEscolar = new Orcamento(400);

        materialEscolar.adicionarItem(new Item("Gramática", 200, 1));
        materialEscolar.adicionarItem(new Item("Livro de Física", 300, 1));
        materialEscolar.adicionarItem(new Item("Papel A4", 25, 4));
        materialEscolar.adicionarItem(new Item("Papel A4", 25, 4));
        materialEscolar.adicionarItem(new Item("Papel A4", 25, 4));
        materialEscolar.adicionarItem(new Item("Papel A4", 25, 4));

        RegraDesconto regraDesConto = configuraACadeiaDeDesconto();

        CalculadorDeDescontos calculadora = new CalculadorDeDescontos();
        double desconto = calculadora.calcula(materialEscolar, regraDesConto );

        System.out.println(desconto );

    }

    private static RegraDesconto configuraACadeiaDeDesconto() {

        RegraDesconto primeiraRegra = new DescontoPorCincoItens();
        RegraDesconto segundaRegra = new DescontoPorMaisDeQuinhentosReais();
        RegraDesconto terceiraRegra = new SemDesconto();

        primeiraRegra.setProximo(segundaRegra );
        segundaRegra.setProximo(terceiraRegra );

        return primeiraRegra;

    }

}
