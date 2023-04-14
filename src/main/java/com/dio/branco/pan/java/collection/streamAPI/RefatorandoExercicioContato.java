package com.dio.branco.pan.java.collection.streamAPI;

import com.dio.branco.pan.java.collection.map.exercicioContato.Contato;

import java.util.*;
import java.util.function.Function;

public class RefatorandoExercicioContato {
     /*Dadas as seguintes informações de id e contato, crie um dicionário e
    ordene este dicionário exibindo (Nome id - Nome contato);
    id = 1 - Contato = nome: Simba, numero: 2222;
    id = 4 - Contato = nome: Cami, numero: 5555;
    id = 3 - Contato = nome: Jon, numero: 1111;

    Refatoração para uso de Lambda.
*/

    public static void main(String[] args) {

        System.out.println("Ordem Aleatória: ");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Camila", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println("- > " + agenda);
        for (Map.Entry<Integer, Contato> contatoEntry: agenda.entrySet()) {
            System.out.println(contatoEntry.getKey() + " - " + contatoEntry.getValue().getNome());
        }
        System.out.println();

        System.out.println("Ordem Inserção: ");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Camila", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println("- > " + agenda1);
        for (Map.Entry<Integer, Contato> contatoEntry: agenda1.entrySet()) {
            System.out.println(contatoEntry.getKey() + " - " + contatoEntry.getValue().getNome());
        }
        System.out.println();

        System.out.println("Ordem id: ");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem por número telefone: Classe Anônima");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
            }
        });
        // Outra forma de implementar classe anonima:
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> contato) {
                        return contato.getValue().getNumero();
                    }

                }));


        // Usando Lambda
        Set<Map.Entry<Integer, Contato>> lambda = new TreeSet<>(Comparator.comparing(
                 contato -> contato.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        set2.addAll(agenda.entrySet());
        lambda.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ":" + entry.getValue().getNome());
        }


        // Lambda:
        System.out.println(" Ordem por nome do contato");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                contato -> contato.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}
