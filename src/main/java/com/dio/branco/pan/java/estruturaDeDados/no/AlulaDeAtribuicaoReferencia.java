package com.dio.branco.pan.java.estruturaDeDados.no;

public class AlulaDeAtribuicaoReferencia {

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA= " + intA + " intB= " + intB);

        intA = 2;
        System.out.println("intA= " + intA + " intB= " + intB);

        Objeto objetoA = new Objeto(1);
        Objeto objetoB = objetoA;

        System.out.println("ObjetoA= " + objetoA + " ObjetoB= " + objetoB);
        objetoA.setNumero(2);
        System.out.println("ObjetoA= " + objetoA + " ObjetoB= " + objetoB);


    }
}
