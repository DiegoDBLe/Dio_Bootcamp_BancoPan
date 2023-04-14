package com.dio.branco.pan.java.orientacaoObjeto.interfaces;

public class Calculadora implements OperacaoMatematica{
    @Override
    public void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("Soma: " + numero1 + " + " + numero2 + " = " + resultado);
    }

    @Override
    public void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("subtracao: " + numero1 + " - " + numero2 + " = " + resultado);

    }

    @Override
    public void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("multiplicacao: " + numero1 + " * " + numero2 + " = " + resultado);

    }

    @Override
    public void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("divisao: " + numero1 + " / " + numero2 + " = " + resultado);

    }
}
