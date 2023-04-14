package com.dio.branco.pan.java.basico.loops;

public class Prova_DIO {
    public static void main(String[] args) {
        int i, num = 5;
        for (i = 0; i < 3; i++) {
            num += i;
            System.out.print(i);
        }

        System.out.println("------------------------------------------------");

        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
        System.out.print(nomes.length);

        System.out.println("------------------------------------------------");

//        int numero = 5, count = 1;
//        do {
//            numero += count;
//            System.out.println(numero);
//            count ++;
//        } while (count <= 3);

        System.out.println("------------------------------------------------");

        int numeros = 5, contador = 1;
        while(contador <= 3) {
            ++contador;
            numeros += contador;
        }
        System.out.println(numeros);

        System.out.println("------------------------------------------------");

        int[][] outrosNumeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
        System.out.print(outrosNumeros[2][2]);
    }

}
