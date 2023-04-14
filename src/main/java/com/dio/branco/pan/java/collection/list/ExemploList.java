package com.dio.branco.pan.java.collection.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
        /* Dada uma lista com 7 notas de uma aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça: */

        /* 01 - Crie uma lista e adicione as sete notas: */

        // Primeira Forma:
        System.out.println("Criando uma Lista e adicionando as 7 notas: ");
        List<Double> notas = new ArrayList<>();
        List<Double> notas1 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        // Desa forma é limitada e não consigo adicionar mais numeros:
        List<Double> notas2 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        // Torna a Lista Imutavel: nem adiciona e nem remove:
        List<Double> notas3 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);


        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println("Lista: " + notas.toString());
        // Imprimindo a posição da nota 5.0:
        System.out.println("Posição: " + notas.indexOf(5d) + "°");

        // adicionando uma nota e escolhendo a posição:
        notas.add(4, 8.5);
        System.out.println("Posição: " + notas.toString());

        // Subistituindo uma nota pore outra:
        notas.set(6, 7.9);
        System.out.println("Posição: " + notas.toString());

        // Se determinada nota está na lista:
        System.out.println("Contem na lista? : " + notas.contains(6.0));

        // Imprimindo a lista percorrendo ela:
        for (Double nota : notas) {
            System.out.println("-> " + nota.toString());
        }

        System.out.println();
        // Exiba a terceira nota adicionada:
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println();
        // Exiba a menor nota:
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // Exiba a menor nota:
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println();
        // Exiba a soma das notas:
        final Iterator<Double> iterator = notas.iterator();
        System.out.println("Exiba a soma das notas: "  );

        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("-> " + soma);

        System.out.println();
        System.out.println("Exiba a média das notas é ->: " + (soma / notas.size())  );

        System.out.println("Removendo a nota ->: " + notas.remove(7d));
        System.out.println("Notas ->: " + notas);

        System.out.println();
        System.out.println("Removendo as notas abaixo de 7 e exiba a lista ->: " );
        Iterator<Double> it = notas.iterator();
        while (it.hasNext()){
            Double next = it.next();
            if(next < 7.0){
                it.remove();
            }
        }
        System.out.println("Notas ->: " + notas);

        System.out.println("Apague toda a lista ->: ");
        notas.clear();
        System.out.println(notas);

        if (notas.isEmpty()){
            System.out.println("Lista vazia!");
        }else{
            System.out.println("Lista NÃO ESTÁ vazia");
        }
    }
}
