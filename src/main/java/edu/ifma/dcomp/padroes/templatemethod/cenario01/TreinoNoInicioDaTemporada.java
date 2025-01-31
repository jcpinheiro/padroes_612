package edu.ifma.dcomp.padroes.templatemethod.cenario01;

class TreinoNoInicioDaTemporada extends Treino {


	protected void preparoFisico() {
		System.out.println("Preparo Fisico Leve.");
	}

	protected void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Junior.");
	}

}