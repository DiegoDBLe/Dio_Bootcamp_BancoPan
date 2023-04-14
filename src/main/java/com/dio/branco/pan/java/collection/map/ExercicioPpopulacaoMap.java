package com.dio.branco.pan.java.collection.map;

import java.util.*;

/* Dada a população estimada de alguns estados do NE brasileiro, faça:
 1- Estado de PE - População = 9.616.621
 2- Estado de AL - População = 3.351.543
 3- Estado de CE - População = 9.187.103
 4- Estado de RN - População = 3.534.265

 - Crie um dicionario e relacione os estados e sua população [X];
 - Substitua a população do estado do RN por 3.534.165 [X];
 - Confira se o estado da PB está no dicionario, caso não adicione [X]: PB - 4.039.277
 - Exiba a população de Pernambuco [X];
 - Exiba todos os estados e suas populaçoes na ordem que foi informado [X];
 - Exiba os estados e suas populaçoes na ordem alfabética [X];
 - Exiba o estado com a maior população e sua quantidade [X];
 - Exiba a soma da população desses estados [X];
 - Exiba a média da população desses estados [X];
 - Remova os estados com a população menor que 4.000.000 [X];
 - Apague o dicionario de estados [X];
 - Confira se o dicionario está vazio [X];
*/
public class ExercicioPpopulacaoMap {

    public static void main(String[] args) {

        Map<String, Double> populacao = new HashMap<>(){{
            put("Pernambuco ", 9.616621);
            put("Alagoas ", 3.351543);
            put("Ceará ", 9.187103);
            put("Rio Grande Do Norte ",3.534265);
        }};
        System.out.println(populacao);
        System.out.println();

        //  Substitua a população do estado do RN por 3.534.165;
        System.out.println("Subistituindo a População do estado do RN: ");
        populacao.put("Rio Grande Do Norte ", 3.534165);
        System.out.println(populacao);
        System.out.println();

        //Confira se o estado da PB está no dicionario, caso não adicione
        // PB - 4.039.277
        if(!populacao.containsKey("Paraiba")) populacao.put("Paraiba ",4.039277);
        System.out.println(populacao);
        System.out.println();

        // Exiba a população de Pernambuco:
        System.out.println("População de Pernambuco: " + populacao.get("Pernambuco "));
        System.out.println();

        // Exiba todos os estados e suas populaçoes na ordem que foi informado:
        System.out.println(" Exiba todos os estados e suas populaçoes na ordem que foi informado: ");
        Map<String, Double> populacao1 = new LinkedHashMap<>(populacao);
        System.out.println(populacao1);
        System.out.println();

        //Exiba os estados e suas populaçoes na ordem alfabética:
        System.out.println("Exiba os estados e suas populaçoes na ordem alfabética:");
        Map<String, Double> populacao2 = new TreeMap<>(populacao1);
        System.out.println(populacao2);
        System.out.println();

        // Exiba o estado com a maior população e sua quantidade:
        System.out.println("Exiba o estado com a maior população e sua quantidade: ");
        Double estadoMaisPopuloso = Collections.max(populacao.values());
        Set<Map.Entry<String, Double>> entrySet = populacao.entrySet();
        String maisPopuloso = " ";

        for (Map.Entry<String, Double> entry: entrySet) {
            if(entry.getValue().equals(estadoMaisPopuloso)){
                maisPopuloso = entry.getKey();
                System.out.println("-> Estado mais populoso: " + maisPopuloso + " - "
                        +estadoMaisPopuloso);
            }
        }
        System.out.println();

        // Exiba a soma da população desses estados:
        System.out.println("Exiba a soma da população desses estados: ");
        Iterator<Double> iterator = populacao.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(String.format("-> Soma da População dos estados: %.7f", soma)
                .replace(",", ".") + " milhões de pessoas.");
        System.out.println();

        // Exiba a soma da população desses estados:
        System.out.println("-> Exiba a média da população dos estados: " + (soma/populacao.size())
                + " milhões de pessoas.");
        System.out.println();

        // Remova os estados com a população menor que 4.000.000:
        System.out.println("Remova os estados com a população abaixo de 4.000.000: ");
        Iterator<Double> iterator1 = populacao.values().iterator();
        Double populacaoAbaixo = 4.000000;

        while (iterator1.hasNext()){
            if(iterator1.next() < populacaoAbaixo){
                iterator1.remove();
            }
        }
        System.out.println(populacao);
        System.out.println();

        // Apague o dicionario de estados:
        if(!populacao.isEmpty()) populacao.clear();

        //Confira se o dicionario está vazio
        if(populacao.isEmpty()) System.out.println("Dicionário Vázio!");
    }
}
