package edu.ifma.dcomp.boaspraticas.roteiro06.modelo;

import edu.ifma.dcomp.boaspraticas.roteiro06.repositorio.ArmazenadorDeDividas;

public class BalancoEmpresa {

    private ArmazenadorDeDividas repositorio;

    public BalancoEmpresa(ArmazenadorDeDividas repositorio) {
        this.repositorio = repositorio;
    }

    public void registraDivida(Divida divida ) {
        if (divida.getDocumentoCredor() != null )
            repositorio.salva(divida );
        else
            throw new IllegalArgumentException("A divida precisa está associada a um CPF ou um CNPJ");
    }

   public void pagaDivida(Documento documentoCredor, Pagamento pagamento ) {
        Divida divida = carregaDivida(documentoCredor );
        divida.registra(pagamento );
        repositorio.salva(divida );
   }

   public Divida carregaDivida(Documento documentoCredor ) {
        Divida divida = repositorio.carrega(documentoCredor );
        if (divida != null) {
            return divida;
        }
       throw new IllegalArgumentException("O Documento informado é inválido!!" );
   }

  /* public void desconecta() {
       bancoDeDados.desconecta();
   }*/
}
