package com.dio.branco.pan.java.basico.operadores;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int segundoNumero = scanner.nextInt();

        int somatoria = somar(primeiroNumero, segundoNumero);
        double subtrair = subtrarir(primeiroNumero, segundoNumero);
        double multiplicar = multiplicar(primeiroNumero, segundoNumero);
        double divisor = divisior(primeiroNumero, segundoNumero);

        System.out.println("Somando os dois valores é: " + somatoria);
        System.out.println("Subtraindo os dois valores é: " + subtrair);
        System.out.println("Multiplicando os dois valores é: " + multiplicar);
        System.out.println("Dividindo os dois valores é: " + divisor);

        System.out.println(System.getenv());
    }

    public static int somar(int primeiroNumero, int segundoNumero){
        int soma = primeiroNumero + segundoNumero;
        return soma;
    }

    public static double subtrarir(int primeiroNumero, int segundoNumero){
        double subtrarir = primeiroNumero - segundoNumero;
        return subtrarir;
    }

    public static double multiplicar(int primeiroNumero, int segundoNumero){
        double multiplicar = primeiroNumero * segundoNumero;
        return multiplicar;
    }

    public static double divisior(double primeiroNumero, double segundoNumero){
        double divisor = primeiroNumero / segundoNumero;
        return divisor;
    }
}
