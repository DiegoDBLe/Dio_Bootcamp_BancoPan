package com.dio.branco.pan.java.basico.loops;

import java.util.Scanner;

public class Exercicio_MaiorMedia {
/*
 Faça um programa que leia 5 números e informe o maior
 e a média desses números.

* */
    public static void main(String[] args) {

        int cont = 1;
        int numero;
        int soma = 0;
        int maior = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o " + cont + "° número:");

            numero = scanner.nextInt();
            soma += numero;

            if(numero > maior)
                maior = numero;

            cont++;
        }while (cont <= 5);

        cont -=1;
        int media = soma / cont;
        System.out.println("O maior número informado foi: " + maior);
        System.out.println("A média dos números foi: " + media);
    }
}
