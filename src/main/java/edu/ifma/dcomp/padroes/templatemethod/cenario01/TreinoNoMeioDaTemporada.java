package edu.ifma.dcomp.padroes.templatemethod.cenario01;

class TreinoNoMeioDaTemporada extends Treino {

	protected void preparoFisico() {
		System.out.println("Preparo Fisico Intenso.");
	}

	protected void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Reserva.");
	}
}