package edu.ifma.dcomp.boaspraticas.roteiro06.repositorio;

import edu.ifma.dcomp.boaspraticas.roteiro06.modelo.Divida;
import edu.ifma.dcomp.boaspraticas.roteiro06.modelo.Documento;

public class ArquivoDeDividas implements ArmazenadorDeDividas {

    @Override
    public void salva(Divida divida) {
        System.out.println("Salvando divida: " + divida);

    }

    @Override
    public Divida carrega(Documento documentoCredor) {
        return new Divida();
    }

    public boolean fecha() {
        return true;
    }
}
