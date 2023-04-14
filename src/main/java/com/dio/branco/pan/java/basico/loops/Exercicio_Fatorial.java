package com.dio.branco.pan.java.basico.loops;

import java.util.Scanner;

/*
 Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario
 ex: 5! = 120 ( 5 x 4 x 3 x 2 x 1)
* */
public class Exercicio_Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o fatorial !: ");
         int fatorial = scanner.nextInt();

         int multiplicacao = 1;

         System.out.print(fatorial + "! = ");
         for (int i = fatorial ; i >= 1; i--) {

             multiplicacao *= i;
         }

         System.out.println(multiplicacao);
    }
}
