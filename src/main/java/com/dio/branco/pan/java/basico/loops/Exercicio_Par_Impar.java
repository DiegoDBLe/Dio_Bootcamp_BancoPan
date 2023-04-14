package com.dio.branco.pan.java.basico.loops;

import java.util.Scanner;

/*
 Faça um programa que peça N números inteiros,
 calcule e mostre a quantidade de números pares
 e a quantidade de números impares.
* */
public class Exercicio_Par_Impar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos números quer informar: ");

        int quantidadeInformada = scanner.nextInt();
        int repeticao = 1;
        int numerosPares = 0, numerosImpares = 0;

        while (repeticao <= quantidadeInformada){
            System.out.println("Digite o " + repeticao + "° número: ");
            int numeroInformado = scanner.nextInt();
            if(numeroInformado % 2 == 0) numerosPares ++;
            else numerosImpares ++;

            repeticao ++;
        }
        System.out.println("Quantidade de números pares informado foi: " + numerosPares);
        System.out.println("Quantidade de números impares informado foi: " + numerosImpares);
    }
}
