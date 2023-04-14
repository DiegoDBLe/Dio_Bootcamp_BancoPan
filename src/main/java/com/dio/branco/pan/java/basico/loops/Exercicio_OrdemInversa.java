package com.dio.branco.pan.java.basico.loops;

/*
 Crie um vetor de 6 números inteiros e mostre-os na ordem inversa
*/
public class Exercicio_OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {0,1,2,3,4,5,6,7,8,9,10};

        System.out.println("Posição: " + vetor[5]);
        System.out.println("---------------- ");

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Posição: " + vetor[i]);
        }

        System.out.println("Reverso:");
        for (int i = vetor.length-1; i >=0; i--){
            System.out.println("Reverso: " + vetor[i]);
        }
    }
}
