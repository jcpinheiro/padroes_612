package edu.ifma.dcomp.padroes.builder.cenario01;

public class Cozinha{
	
	public void fazSanduiche(SanduicheBuilder builder){
		builder.abrePao();
		builder.insereIngredientes();
		builder.fechaPao();
	}
}
