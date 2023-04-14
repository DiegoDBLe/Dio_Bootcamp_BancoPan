package com.dio.branco.pan.java.collection.map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNome implements Comparator<Map.Entry<String, Livros>> {
    @Override
    public int compare(Map.Entry<String, Livros> livro1, Map.Entry<String, Livros> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}
