package edu.ifma.dcomp.roteiro05;

public class TesteComparaCPF {

    public static void main(String[] args) {
        CPF cpf1 = new CPF("123.456.789-30");
        CPF cpf2 = new CPF("123.456.789-30");
        CPF cpf3 = cpf1;

        System.out.println(cpf1.equals(cpf2));
        System.out.println(cpf1.equals(cpf3));
        System.out.println(cpf2.equals(cpf3));

        System.out.println("------------------");
        System.out.println(cpf1 == cpf2);
        System.out.println(cpf1 == cpf3);
        System.out.println(cpf2 == cpf3);

    }
}
