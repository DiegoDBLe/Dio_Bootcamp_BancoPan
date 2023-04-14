package com.dio.branco.pan.java.collection.set;

import java.util.Comparator;

public class ComparatorPorGenero implements Comparator<ExercicioSerie> {
    @Override
    public int compare(ExercicioSerie ex1, ExercicioSerie ex2) {
        int genero = ex1.getGenero().compareToIgnoreCase(ex2.getGenero());

        return genero;
    }
}
