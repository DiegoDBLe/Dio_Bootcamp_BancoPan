package com.dio.branco.pan.java.collection.set;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {
        /* Crie um conjunto e adicione as seguintes notas: */

        Set<Double> setDeNotas = new HashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Imprimindo Set -> HashSet: " + setDeNotas);
        System.out.println();

        //Exibindo a nota 5.0:
        System.out.println("Exibindo a nota 5.0: " + setDeNotas.contains(5.0));

        //Adicione na lista a nota 8.0 na posição 4: NÃO CONSEGUIMOS INSERIR VALOR EM DETERMINADA POSIÇÃO UTILIZANDO SET
        // Substitua a nota 5.0 pela nota 6.0: NÃO CONSEGUIMOS INSERIR VALOR EM DETERMINADA POSIÇÃO UTILIZANDO SET

        // Confira se a nota 5.0 está no conjunto:
        System.out.println("Confira se a nota 5.0 está no conjunto: " + setDeNotas.contains(5.0));
        //Exiba a terceira nota adicionada: NÃO CONSEGUIMOS INSERIR VALOR EM DETERMINADA POSIÇÃO UTILIZANDO SET

        // Exiba a menor nota:
        System.out.println("Exiba a menor nota:: " + Collections.min(setDeNotas));
        // Exiba a maior nota:
        System.out.println("Exiba a maior nota:: " + Collections.max(setDeNotas));

        // Exiba aa soma dos valores:
        Iterator<Double> next = setDeNotas.iterator();
        Double soma = 0d;

        while (next.hasNext()){
           Double proximo = next.next();
           soma += proximo;
        }
        System.out.println(String.format("Exiba aa soma dos valores: %.2f", soma)
                .replace(",", "."));

        //Exibindo a Média:
        Double media = soma / setDeNotas.size();
        System.out.println(String.format("Exibindo a Média: %.2f",  (media))
                .replace(",", "."));

        //Removendo a nota 0.0:
        System.out.println("Removendo a nota 0.0: " + setDeNotas.remove(0d));
        System.out.println(setDeNotas);

        // Remova as notas menores que 7.0 e exiba na lista:
        Iterator<Double> next1 = setDeNotas.iterator();
        while (next1.hasNext()){
            Double proximo = next1.next();
            if(proximo < 7.0) next1.remove();
        }
        System.out.println(setDeNotas);

        // Exiba todas as nota na ordem que foram informadas: Tem que ser com LinkedHashSet:
        Set<Double> linkedSetNotas = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("LinkedHashSet -> " + linkedSetNotas);

        // Ordem crescente é o TreeSet:
        System.out.println("Ordem Crescente: ");
        Set<Double> treeSet = new TreeSet<>(linkedSetNotas);
        System.out.println("TreeSet -> " + treeSet);

        // Apagando o conjunto:
        setDeNotas.clear();
        boolean vazio = setDeNotas.isEmpty();
        if(vazio){
            System.out.println("Conjunto Vázio " + setDeNotas);
        }else {
            System.out.println("Conjunto -> " + setDeNotas);
        }
    }
}
