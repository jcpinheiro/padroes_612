package edu.ifma.dcomp.boaspraticas.roteiro01;

public class Cadastro {
 
  private String nome;
  private String cpf;
  private String cnpj;
  private boolean pessoaFisica;
 
  public boolean processa(String acao, String tipo, String nome,
                          String cpf, String cnpj) {
    if(cpf != null) {
      String erro = "";
      if (cpf.length() < 11)
        erro += "Sao necessarios 11 digitos para verificacao do CPF! \n\n";
      if(cpf.matches(".*\\D.*"))
        erro += "A verificacao de CPF suporta apenas numeros! \n\n";
      if(cpf == "00000000000" || cpf == "11111111111" ||
         cpf == "22222222222" || cpf == "33333333333" ||
         cpf == "44444444444" || cpf == "55555555555" ||
         cpf == "66666666666" || cpf == "77777777777" ||
         cpf == "88888888888" || cpf == "99999999999") {
        erro += "Numero de CPF invalido!";
      }
      int[] a = new int[11];
      int b = 0;
      int c = 11;
      for(int i = 0; i < 11; i++) {
        a[i] = cpf.charAt(i) - '0';
        if(i < 9) b += (a[i] * --c);
      }
      int x = b % 11;
      if(x < 2) {
        a[9] = 0;
      }
      else {
        a[9] = 11-x;
      }
      b = 0;
      c = 11;
      for(int y = 0; y < 10; y++) b += (a[y] * c--);
      x = b % 11;
      if(x < 2) {
        a[10] = 0;
      }
      else {
        a[10] = 11-x;
      }
      if((cpf.charAt(9) - '0' != a[9]) || (cpf.charAt(10) - '0' != a[10])) {
        erro +="Digito verificador com problema!";
      }
      if(erro.length() > 0) {
        return false;
      }
    }
    if("cadastra".equalsIgnoreCase(acao)) {
      if("pessoa_fisica".equals(tipo)) {
        if(cnpj != null) {
          return false;
        }
        else {
          this.nome = nome;
          this.cpf = cpf;
          this.pessoaFisica = true;
        }
      }
      else if ("pessoa_juridica".equals(tipo)) {
        if(cpf != null) {
          return false;
        }
        else {
          this.nome = nome;
          this.cnpj = cnpj;
          this.pessoaFisica = false;
        }
      }
    }
    else if("atualiza".equals(acao)) {
      if("pessoa_fisica".equals(tipo)) {
        if(cnpj != null) {
          return false;
        }
        else {
          this.nome = nome;
          this.cpf = cpf;
          this.pessoaFisica = true;
        }
      }
      else if ("pessoa_juridica".equals(tipo)) {
        if(cpf != null) {
          return false;
        }
        else {
          this.nome = nome;
          this.cnpj = cnpj;
          this.pessoaFisica = false;
        }
      }
    }
 
    return false;
  }
 
  public String getNome() {
    return nome;
  }
 
  public void setNome(String nome) {
    this.nome = nome;
  }
 
  public String getCpf() {
    return cpf;
  }
 
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
 
  public String getCnpj() {
    return cnpj;
  }
 
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
 
  public boolean isPessoaFisica() {
    return pessoaFisica;
  }
 
  public void setPessoaFisica(boolean pessoaFisica) {
    this.pessoaFisica = pessoaFisica;
  }
}
