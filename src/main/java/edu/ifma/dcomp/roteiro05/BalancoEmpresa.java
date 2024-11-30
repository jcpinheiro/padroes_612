package edu.ifma.dcomp.roteiro05;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {

    private Map<CNPJ, Divida> dividasPJ = new HashMap<>();
    private Map<CPF, Divida>  dividasPF = new HashMap<>();

    public void registraDivida(Divida divida ) {
        if (divida.getCnpjCredor() != null )
              dividasPJ.put(divida.getCnpjCredor(), divida );

        else if (divida.getCpfCredor() != null )
            dividasPF.put(divida.getCpfCredor(), divida );

        else
            throw new IllegalArgumentException("A divida precisa está associada a um CPF ou um CNPJ");
    }

   public void pagaDivida(CNPJ cnpjCredor, Pagamento pagamento ) {
        Divida divida = carregaDivida(cnpjCredor );
        divida.registra(pagamento );
   }

    public void pagaDivida(CPF cpfCredor, Pagamento pagamento ) {
        Divida divida = carregaDivida(cpfCredor );
        divida.registra(pagamento );
    }

   public Divida carregaDivida(CNPJ cnpjCredor ) {
        Divida divida = dividasPJ.get(cnpjCredor);
        if (divida != null) {
            return divida;
        }
       throw new IllegalArgumentException("O CNPJ informado é inválido!!" );
   }

    public Divida carregaDivida(CPF cpfCredor ) {
        Divida divida = dividasPJ.get(cpfCredor);
        if (divida != null) {
            return divida;
        }
        throw new IllegalArgumentException("O CPF informado é inválido!!" );
    }
}
