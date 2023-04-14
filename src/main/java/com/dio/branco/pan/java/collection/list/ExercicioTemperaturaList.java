package com.dio.branco.pan.java.collection.list;

        /* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as
         em uma lista. Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas
         acima da média, e em que mês ocorrera (mostrar o mês por extenso ex: 1 - Janeiro, 2 - Fevereiro */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioTemperaturaList {

    public static void main(String[] args) {
       String[] listaMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho"};
       List<Double> temperaturas = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);

       for(int i = 0; i < listaMeses.length; i++){
           System.out.println("Digite a temperatura do mês " + listaMeses[i] + ":");
           double temperatura = scanner.nextDouble();
           temperaturas.add(temperatura);
       }

       double temperaturaMedia = 0;
        for (double temp : temperaturas) {
            temperaturaMedia += temp;
        }
        temperaturaMedia /= temperaturas.size();

       System.out.print(String.format("A média da temperatura do semestre foi de %.2f",
               temperaturaMedia).replace(",", ".") + "°");

       System.out.println("\nOs meses com a temperatura acima da média foram: ");
       for(int i = 0; i < temperaturas.size(); i++){
           if(temperaturas.get(i) > temperaturaMedia)
               System.out.println(String.format("%.2f %s", temperaturas.get(i),
                       listaMeses[i]).replace(",", "."));
       }
    }
}
