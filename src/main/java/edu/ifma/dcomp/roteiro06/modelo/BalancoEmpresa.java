package edu.ifma.dcomp.roteiro06.modelo;

import edu.ifma.dcomp.roteiro06.repositorio.BancoDeDados;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {

    private BancoDeDados bancoDeDados;

    public BalancoEmpresa(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void registraDivida(Divida divida ) {
        if (divida.getDocumentoCredor() != null )
              bancoDeDados.salva(divida );
        else
            throw new IllegalArgumentException("A divida precisa está associada a um CPF ou um CNPJ");
    }

   public void pagaDivida(Documento documentoCredor, Pagamento pagamento ) {
        Divida divida = carregaDivida(documentoCredor );
        divida.registra(pagamento );
        bancoDeDados.salva(divida );
   }

   public Divida carregaDivida(Documento documentoCredor ) {
        Divida divida = bancoDeDados.carrega(documentoCredor );
        if (divida != null) {
            return divida;
        }
       throw new IllegalArgumentException("O Documento informado é inválido!!" );
   }

  /* public void desconecta() {
       bancoDeDados.desconecta();
   }*/
}
