package com.dio.branco.pan.java.collection.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "1", "2", "3", "9", "9", "6","5");
        System.out.println(numerosAleatorios);
        System.out.println();

        //Usando Method Reference:
        System.out.println("Imprima todos os elementos dessa lista de String Usando Method Reference:: ");
        numerosAleatorios.forEach(System.out::println);
        System.out.println();

        //Usando Method Reference:
        System.out.println("Pegue os 5 primeiros elementos dessa lista e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();

        //Usando Method Reference:
        System.out.println("Tranforme esta lista de String em uma Lista de números inteiro:  ");
        List<Integer> numerosAleatorio1 = new java.util.ArrayList<>(numerosAleatorios.stream().map(Integer::parseInt).toList());
        System.out.println(numerosAleatorio1);
        //ou
        System.out.println("-> ou <-");
        numerosAleatorio1.stream().toList().forEach(System.out::println);

        System.out.println();

        //Usando Method Reference, map, collection:
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:  ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 0)
                .toList()
                .forEach(System.out::println);

        System.out.println();

        //Usando Method Reference, map, collection:
        System.out.println("Mostre a média dos números:  ");
        final boolean present = numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .isPresent();
        System.out.println("Mostre: " + present);

        System.out.println();

        //Usando Method Reference, map, collection:
        System.out.println("Remova os valores impares:  ");
        numerosAleatorio1.removeIf(integer -> integer % 2 != 0);
        System.out.println("Mostre: " + numerosAleatorio1);

        // Exercicios:
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante: ");
        System.out.println("Retirando os números repetidos da lista, quantos números ficam?: ");
        System.out.println("Mostre o menor valor da lista: ");
        System.out.println("Mostre o maior va.or da lista: ");
        System.out.println("Pegue apenas os números impares e some: ");
        System.out.println("Mostre a lista na ordem númerica: ");
        System.out.println("Agrupe os valores impares mútiplos de 3 e de 5: ");
    }
}
