package edu.ifma.dcomp.boaspraticas.roteiro04;

import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<String, Divida> dividas = new HashMap<>();

    public void registraDivida(Divida divida ) {
           dividas.put(divida.getCredor(), divida );
    }

   public void pagaDivida(String cnpjCredor, Pagamento pagamento ) {
        Divida divida = carregaDivida(cnpjCredor );
        divida.registra(pagamento );
   }
   public Divida carregaDivida(String cnpjCredor ) {
        Divida divida = dividas.get(cnpjCredor);
        if (divida != null) {
            return divida;
        }
       throw new IllegalArgumentException("O CNPJ informado é inválido!!" );
   }
}
