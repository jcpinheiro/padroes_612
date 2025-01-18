package edu.ifma.dcomp.boaspraticas.roteiro06.repositorio;

import edu.ifma.dcomp.boaspraticas.roteiro06.modelo.Divida;
import edu.ifma.dcomp.boaspraticas.roteiro06.modelo.Documento;

public interface ArmazenadorDeDividas {
    void salva(Divida divida);

    Divida carrega(Documento documentoCredor);
}
