package com.dio.branco.pan.java.basico.loops;

import java.util.Random;

/*
 Gere e imprima uma matriz M de 4x4 com valores aleatórios entre 0-9
* */
public class Exercicio_ArrayMultidimensional {
    public static void main(String[] args) {
        Random gerarNumeroAleatorios = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = gerarNumeroAleatorios.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha: matriz ) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println(" ");
        }
    }
}
