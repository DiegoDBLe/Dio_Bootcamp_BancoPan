package com.dio.branco.pan.java.basico.operadores;

import java.util.Scanner;

public class OperadoreTernario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int b = scanner.nextInt();

        String resultado = a==b ? "Verdadeiro" :"Falso";
        String maior = a>b ? "Verdadeiro" :"Falso";

        System.out.println("São iguais? " + resultado);
        System.out.println("O Primeiro número é maior que o segundo? " + maior);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o primeiro nome: ");
        String primeiroNome = scanner2.next().toUpperCase();
        System.out.println("Digite o segundo nome: ");
        String segundoNome = scanner2.next().toUpperCase();

        String iguais = primeiroNome.equals(segundoNome) ? "São iguais":"São diferentes";

        System.out.println("Os nomes são iguais? " + iguais);
        System.out.println(primeiroNome);
        System.out.println(segundoNome);

    }
}
