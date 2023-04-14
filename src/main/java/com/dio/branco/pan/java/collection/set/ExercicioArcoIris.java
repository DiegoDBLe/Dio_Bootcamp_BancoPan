package com.dio.branco.pan.java.collection.set;

import java.util.*;

/* Crie um conjunto contendo as cores do arco-iris e:
A - Exiba todas as cores uma abaixo da outra [X];
B - A quantidade de cores que o arco-iris tem [X];
C - Exiba as cores em ordem alfabetica [X];
D - Exiba as cores na ordem inversa da que foi informada [X];
F - Exiba as cores que começam com a letra 'V' [x];
G - Limpe o conjunto [x];
H - Confira se o conjunto está vazio [x];
* */
public class ExercicioArcoIris {
    public static void main(String[] args) {

        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil",
                "violeta"));

        // Exiba todas as cores uma abaixo da outra:
        System.out.println("Exibindo as cores uma abaixo da outra: ");
        for (String cor: arcoIris) {
            System.out.println("-> " + cor);
        }

        // A quantidade de cores que o arco-iris tem
        System.out.println("A quantidade de cores que o arco-iris tem: " + arcoIris.size() + " cores");

        // Exiba as cores em ordem alfabetica [];
        System.out.println("Exiba as cores em ordem alfabetica: " );
        Set<String> coresOrdenandas = new TreeSet<>(arcoIris);
        for (String cores : coresOrdenandas) System.out.println(cores);

        //  Exiba as cores na ordem inversa da que foi informada
        System.out.println("Exiba as cores na ordem inversa da que foi informada: " );
        List<String> listaDeCores = new ArrayList<>(arcoIris);
        Collections.reverse(listaDeCores);
        for (String cores: arcoIris)  System.out.println("-> " + cores);
        for (String cores: listaDeCores)  System.out.println("<-" + cores);

        //Exiba as cores que começam com a letra 'V':
        System.out.println("Exiba as cores que começam com a letra V: ");
        for (String cor: arcoIris) {
            if(cor.startsWith("v")){
                System.out.println("-> " + cor);
            }
        }

        //Limpe o conjunto:
        arcoIris.clear();

        // Confira se o conjunto está vazio:
        if(arcoIris.isEmpty()){
            System.out.println("Conjunto vázio!");
        }else {
            System.out.println("Conjunto NÃO está vázio!");
        }
    }
}
