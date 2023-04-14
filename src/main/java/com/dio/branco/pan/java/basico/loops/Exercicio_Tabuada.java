package com.dio.branco.pan.java.basico.loops;

import java.util.Scanner;

/*
 Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer número inteiro
 entre 1 a 10. O usuario deve informar qual numero ele deseja ver a tabuada:
 tabuada de 5:
 5 x 1 = 5
 5 x 2 = 10
* */
public class Exercicio_Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número da tabuada entre 1 a 10: ");
        int numero = scanner.nextInt();

        for(int i = 0; i <= 10; i++) {
            int multiplicacao = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacao);
        }
    }
}
