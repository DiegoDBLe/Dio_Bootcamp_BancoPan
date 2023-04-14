package com.dio.branco.pan.java.metodos;

public class MetodosComRetorno {

    public String getMensagem() {
        return "Olá";
    }

    public void executar(){
        return;
    }

    public static double area(double lado){
        double calculo =  lado * lado;
        System.out.println("Área do quadrado: " + calculo);
        return calculo;
    }

    public static double area(double lado1, double lado2){
        double calculo = lado1 * lado2;
        System.out.println("Área do retângulo: " + calculo);

        return calculo;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        double calculo = (baseMaior + baseMenor)* altura /2;
        System.out.println("Área do trapézio: " + calculo);
        return calculo;
    }


}
