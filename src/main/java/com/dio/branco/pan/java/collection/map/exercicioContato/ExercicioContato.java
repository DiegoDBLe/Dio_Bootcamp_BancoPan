package com.dio.branco.pan.java.collection.map.exercicioContato;

import java.util.*;

public class ExercicioContato {
    /*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
    id = 1 - Contato = nome: Simba, numero: 2222;
    id = 4 - Contato = nome: Cami, numero: 5555;
    id = 3 - Contato = nome: Jon, numero: 1111;
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

        System.out.println("Ordem por número telefone: ");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNomeContato());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ":" + entry.getValue().getNome());
        }
        System.out.println(" Ordem por nome do contato");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}
