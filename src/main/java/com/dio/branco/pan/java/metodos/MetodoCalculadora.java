package com.dio.branco.pan.java.metodos;

public class MetodoCalculadora {

    public static void soma(double numero1, double numero2){

        double resultado = numero1 + numero2;

        System.out.println("A Soma entre: " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2){

        double resultado = numero1 - numero2;

        System.out.println("A Subtracao entre: " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){

        double resultado = numero1 * numero2;

        System.out.println("A Multicacao entre entre: " + numero1 + " x " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2){

        double resultado = numero1 / numero2;

        System.out.println("A Divisao entre entre: " + numero1 + " / " + numero2 + " = " + resultado);
    }
}
