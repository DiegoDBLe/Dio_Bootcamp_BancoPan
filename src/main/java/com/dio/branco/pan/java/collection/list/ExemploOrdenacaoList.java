package com.dio.branco.pan.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Dadas as seguintes informações sobre  meus gatos, crie uma lista
    ordene esta lista exibindo: (nome - idade - cor)

    Example: Gato1 = nome: Jon, idade: 18, cor: preto
    Example: Gato2 = nome: Simba, idade: 6, cor: tigrado
    Example: Gato3 = nome: Jon, idade: 12, cor: amarelo

* */
public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> listaDeGatos = new ArrayList<>() {{

            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};

        System.out.println("Ordem de Inserção: " + listaDeGatos);
        System.out.println();

        System.out.println("Ordem Aleatória: ");
        Collections.shuffle(listaDeGatos);
        System.out.println(listaDeGatos);

        System.out.println();
        System.out.println("Ordem Natural: ");
        Collections.sort(listaDeGatos);

        System.out.println();
        System.out.println("Ordem por Idade: ");
        listaDeGatos.sort(new ComparatorIdade());
        System.out.println(listaDeGatos);

        System.out.println();
        System.out.println("Ordem por Cor: ");
        listaDeGatos.sort(new ComparatorCor());
        System.out.println(listaDeGatos);

        System.out.println();
        System.out.println("Ordem por Nome/Cor/Idade: ");
        listaDeGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(listaDeGatos);

    }
}
