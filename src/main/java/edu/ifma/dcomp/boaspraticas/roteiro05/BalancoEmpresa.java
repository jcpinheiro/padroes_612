package edu.ifma.dcomp.boaspraticas.roteiro05;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {

    private Map<Documento, Divida> dividas = new HashMap<>();

    public void registraDivida(Divida divida ) {
        if (divida.getDocumentoCredor() != null )
              dividas.put(divida.getDocumentoCredor(), divida );
        else
            throw new IllegalArgumentException("A divida precisa está associada a um CPF ou um CNPJ");
    }

   public void pagaDivida(Documento documentoCredor, Pagamento pagamento ) {
        Divida divida = carregaDivida(documentoCredor );
        divida.registra(pagamento );
   }

   public Divida carregaDivida(Documento documentoCredor ) {
        Divida divida = dividas.get(documentoCredor);
        if (divida != null) {
            return divida;
        }
       throw new IllegalArgumentException("O Documento informado é inválido!!" );
   }
}
