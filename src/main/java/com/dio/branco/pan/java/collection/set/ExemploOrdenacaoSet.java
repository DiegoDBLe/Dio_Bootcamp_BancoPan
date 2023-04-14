package com.dio.branco.pan.java.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* Dadas as seguintes informações sobre minhas series favoritas,
    crie um conjuntos e ordene este conjunto exibindo:
    (nome- generep - tempo de episodio);

    Série 1 = Nome: Got, genero: fantasia, tempoEpisodio: 60
    Série 2 = Nome: Dark, genero: Dark, tempoEpisodio: 60
    Série 3 = Nome: that '70s show, genero: that '70s show, tempoEpisodio: 25
*/
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        // Ordem Aleatória:
        System.out.println("Ordem Aleatória: ");

        Set<ExercicioSerie> serieSet = new HashSet<>(){{
            add(new ExercicioSerie("Got", "Fantasia", 60));
            add(new ExercicioSerie("Dark", "drama", 60));
            add(new ExercicioSerie("that '70s show", "Cómedia", 25));
        }};

        for (ExercicioSerie serie: serieSet) {
            System.out.println(" -> " + serie.toString());
        }
        System.out.println();
        // ou posso imprimir assim:
        for (ExercicioSerie serie: serieSet)  System.out.println(" -> " + serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Ordem de Inserção só com LinkedHashSet:
        System.out.println("Ordem de Inserção só com LinkedHashSet:");
        Set<ExercicioSerie> serieLinkedHashSet = new LinkedHashSet<>(){{
            add(new ExercicioSerie("Got", "Fantasia", 60));
            add(new ExercicioSerie("Dark", "Dark", 60));
            add(new ExercicioSerie("that '70s show", "Cómedia", 25));
        }};
        for (ExercicioSerie serie: serieSet)  System.out.println(" -> " + serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Ordem Natural (TempoEpisodio)
        System.out.println("Ordem Natural TreeSet:");
        Set<ExercicioSerie> treeSet = new TreeSet<>(serieLinkedHashSet);
        for (ExercicioSerie serie: treeSet) System.out.println(" -> " + serie.getNome() + " - " + serie.getGenero() +
                " - " + serie.getTempoEpisodio());

        // Ordem Nome/Gênero/TempoEpisodio
        System.out.println("Ordem Nome/Gênero/TempoEpisodio: ");
        Set<ExercicioSerie> nomeTreeSet = new TreeSet<>(new ComparatorNomeGeneroEpisodio());
        nomeTreeSet.addAll(serieSet);
        for (ExercicioSerie serie: nomeTreeSet) System.out.println(" -> " + serie.getNome() + " - " + serie.getGenero() +
                " - " + serie.getTempoEpisodio());
        System.out.println();

        System.out.println("Ordem por Gênero: ");
        Set<ExercicioSerie> oredenacaoGenero = new TreeSet<>(new ComparatorPorGenero());
        oredenacaoGenero.addAll(serieSet);
        for (ExercicioSerie serie: oredenacaoGenero) System.out.println(" -> " + serie.getNome() + " - " + serie.getGenero() +
                " - " + serie.getTempoEpisodio());
    }
}
