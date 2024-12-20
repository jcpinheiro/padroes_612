package edu.ifma.dcomp.roteiro06.repositorio;

import edu.ifma.dcomp.roteiro06.modelo.Divida;
import edu.ifma.dcomp.roteiro06.modelo.Documento;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados {

  private Map<Documento, Divida> dividasNoBanco = new HashMap<Documento, Divida>();
 
  public BancoDeDados(String endereco, String usuario, String senha) {
    System.out.println("Conectado!");
  }

  public void salva(Divida divida) {
    dividasNoBanco.put(divida.getDocumentoCredor(), divida);
  }
   public Divida carrega(Documento documentoCredor) {
    return dividasNoBanco.get(documentoCredor);
  }
   public void desconecta() {
    System.out.println("Desconectado!");
  }
}
