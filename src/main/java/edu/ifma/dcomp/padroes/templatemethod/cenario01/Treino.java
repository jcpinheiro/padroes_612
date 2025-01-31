package edu.ifma.dcomp.padroes.templatemethod.cenario01;

public abstract class Treino {

	// template method
	public final void treinoDiario() {
		// implementações concretos
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}

	protected abstract void preparoFisico();
	protected abstract void jogoTreino();

	final void treinoTatico() {
		System.out.println("Treino Tatico");
	}

}