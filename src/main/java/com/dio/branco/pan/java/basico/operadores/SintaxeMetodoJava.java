package com.dio.branco.pan.java.basico.operadores;

import java.util.Scanner;

public class SintaxeMetodoJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next().toUpperCase();
        System.out.println("Digite seu sobrenome: ");
        String segundoNome = scanner.next().toUpperCase();

        String nomeCompletoScanner = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("Nome Completo: ".concat(nomeCompletoScanner));

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        String nomeCompleto = nomeCompleto("Diego", "Dantas");
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ") + segundoNome;
    }
}
