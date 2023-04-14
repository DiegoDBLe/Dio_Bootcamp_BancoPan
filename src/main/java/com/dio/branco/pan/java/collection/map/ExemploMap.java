package com.dio.branco.pan.java.collection.map;

import java.util.*;

/* Dada os modelos dos carros e seus respectivos consimos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6km/l
 modelo = mobi - consumo = 16,1km/l
 modelo = hb20 - consumo = 14,5km/l
 modelo = kwid - consumo = 15,6km/l
*
* */
public class ExemploMap {
    public static void main(String[] args) {

        // Iniciando o MAP:
        Map<String, Double> carrosPopulares = new HashMap<String, Double>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println("-> " + carrosPopulares);
        System.out.println();

        // Subistituindo valor:
        System.out.println("->  Substitua o consumo do gol por 15,2 km/l" + carrosPopulares);
        carrosPopulares.put("gol", 15.2);
        System.out.println("-> " + carrosPopulares);
        System.out.println();

        // Conferindo se um determinado valor está na lista:
        System.out.println("->  Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println();

        // Conferindo o valor de uma chave:
        System.out.println("->  Exiba o consumo do Uno: " + carrosPopulares.get("uno"));

        System.out.println();

        // Exiba os modelos(chaves):
        System.out.println("->  Exiba os modelos: " + carrosPopulares.keySet());

        System.out.println();

        // Exiba os valores(values):
        System.out.println("->  Exiba os valores: " + carrosPopulares.values());

        System.out.println();

        // Exiba os valores(values) máximo:
        System.out.println("->  Exiba o maior consumo: ");
        Double consumo = Collections.max(carrosPopulares.values());
        System.out.println("-> Maior consumo: " + consumo);

        System.out.println();

        // Exiba o modelo mais economico ou seja o mais eficiente:
        System.out.println("->  Exiba o modelo mais eficiente: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entry = carrosPopulares.entrySet();
        String modeloMaisEficiente = " ";

        for (Map.Entry<String, Double> entrys : entry) {
            if (entrys.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entrys.getKey();
                System.out.println("-> Modelo Mais eficiente: " + modeloMaisEficiente + " - "
                        + consumoMaisEficiente + " km/l");
            }
        }
        System.out.println();

        // Exiba o modelo mais gastão ou seja o de maior consumo:
        System.out.println("->  Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>>  entrada = carrosPopulares.entrySet();
        String modeloMenosEficiente = " ";

        for (Map.Entry<String, Double> entradas : entrada){
            if(entradas.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entradas.getKey();
                System.out.println("--> Modelo menos eficiente: " + modeloMenosEficiente + " - "
                        + consumoMenosEficiente + " km/l");
            }
        }

        System.out.println();
        // Soma dos consumos:
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("--> Soma dos consumos: " + soma + " km/lts");

        System.out.println();
        System.out.println("--> Média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()) + " km/lts");

        System.out.println();
        System.out.println("Remova os modelos com o consumo igual a 15.6 km/lts: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println();
        //Ordem que foram informados:
        System.out.println("--> Exiba todos os carros na ordem em que foram informados " );
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);
        System.out.println();

        // Exiba todos os carros ordenando pelo modelo (chave):
        System.out.println("--> Exiba todos os carros ordenados pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println();

        // Apague o dicionario de carros::
        System.out.println("--> Apagar o dicionario: ");
        carrosPopulares.clear();
        boolean vazio = carrosPopulares.isEmpty();
        if (vazio) System.out.println("Dicionario Está vázio!");
    }
}
