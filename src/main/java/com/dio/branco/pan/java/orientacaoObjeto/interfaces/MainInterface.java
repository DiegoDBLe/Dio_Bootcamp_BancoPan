package com.dio.branco.pan.java.orientacaoObjeto.interfaces;

public class MainInterface {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.soma(5,6);
        calculadora.multiplicacao(5,6);
        calculadora.subtracao(5,6);
        calculadora.divisao(5,6);
    }
}
