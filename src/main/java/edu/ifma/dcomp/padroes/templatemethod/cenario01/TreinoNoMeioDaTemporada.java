package edu.ifma.dcomp.padroes.templatemethod.cenario01;

class TreinoNoMeioDaTemporada extends Treino {

	void preparoFisico() {
		System.out.println("Preparo Fisico Intenso.");
	}

	void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Reserva.");
	}
}