package com.dio.branco.pan.java.collection.set;

import java.util.Comparator;

public class ComparatorNomeGeneroEpisodio implements Comparator<ExercicioSerie> {
    @Override
    public int compare(ExercicioSerie ex1, ExercicioSerie ex2) {
        int nome = ex1.getNome().compareToIgnoreCase(ex2.getNome());
        if(nome != 0) return nome;

        int genero = ex1.getGenero().compareTo(ex2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(ex1.getTempoEpisodio(), ex2.getTempoEpisodio());
    }
}
