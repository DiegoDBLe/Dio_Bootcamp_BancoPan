package com.dio.branco.pan.java.basico.loops;

import java.util.Scanner;

/*
 Faça um programa que peça uma nota, entre zero e dez.
 Mostre uma mensagem caso o valor seja inválido e continue
 pedindo até que o usúario informe um valor inválido.
* */
public class Exercicio_Nota {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma nota entre 0 e 10: ");

        int nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota Inválida!\nDigite uma nota válida:");
            nota = scanner.nextInt();
        }
    }
}
