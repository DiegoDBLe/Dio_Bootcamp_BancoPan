package com.dio.branco.pan.java.basico.loops;

import java.util.Random;

/*
 Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 Ao final mostre os números e seus sucessores.
* */
public class Exercicio_NumerosAleatorios {

    public static void main(String[] args) {
        Random geradorDeNumerosAleatorios = new Random();

        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++){
            int numero = geradorDeNumerosAleatorios.nextInt(100);
            vetor[i] = numero;
        }

        System.out.println("Números Aleatorios: ");
        for (int numerosGerados: vetor) {
            System.out.print(numerosGerados + " ,");
        }
        System.out.println("\nNúmeros Sucessores: ");
        for (int numerosGerados: vetor) {
            System.out.print(numerosGerados+1 + " ,");
        }
        System.out.println("\nNúmeros Antecessor: ");
        for (int numerosGerados: vetor) {
            System.out.print(numerosGerados-1 + " ,");
        }
    }
}


