package edu.ifma.dcomp.padroes.templatemethod.cenario01;

import java.time.LocalDate;

public class TesteTreino {

    public static void main(String[] args) {
        Treino treinoInicioTemporada = new TreinoNoInicioDaTemporada();
        treinoInicioTemporada.treinoDiario();

        System.out.println("-----------------------");

        Treino treinoMeioTemporada = new TreinoNoMeioDaTemporada();
        treinoMeioTemporada.treinoDiario();
        System.out.println("-----------------------");

        LocalDate dataProva = LocalDate
                .now()
                .plusMonths(3)
                .plusDays(5);

        System.out.println(dataProva );



    }
}
