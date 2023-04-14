package com.dio.branco.pan.java.collection.set;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class ExercicioSerie implements Comparable<ExercicioSerie> {

    private String nome;
    private String genero;
    private int tempoEpisodio;

    public ExercicioSerie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public int compareTo(ExercicioSerie exercicioSerie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), exercicioSerie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(exercicioSerie.getGenero());
    }
}
