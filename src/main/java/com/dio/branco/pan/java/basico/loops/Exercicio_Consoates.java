package com.dio.branco.pan.java.basico.loops;

import java.util.Scanner;

/*
 Faça um programa que leia um vetor de 6 caracteres e diga quantas consoates foram lidas.
 Imprima as consoantes.
* */
public class Exercicio_Consoates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0 , cont = 0;

        do{
            System.out.println("Digite uma Letra: ");
            String letra = scanner.next();

            if(!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))){
               consoantes[cont] = letra;
               quantidadeConsoantes++;
            }
            cont++;
        }while(cont < consoantes.length);

        for (String consoante:consoantes) {
            if (consoante != null){
                System.out.print(consoante + ",");
            }
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}
