package com.dio.branco.pan.java.metodos;

public class MetodoMensagem {

    public static void obterMensagem(int hora){

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> mensagemBomDia();
            case 13, 14, 15, 16, 17 -> mensagemBoaTarde();
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> mensagemBoaNoite();
            default -> mensagemHoraInvalida();
        }
    }

    private static void mensagemHoraInvalida() {
        System.out.println("Hora Inválida!");
    }

    private static void mensagemBoaNoite() {
        System.out.println("Boa Noite!");
    }

    private static void mensagemBoaTarde() {
        System.out.println("Bom tarde!");
    }

    private static void mensagemBomDia() {

        System.out.println("Bom dia!");
    }
}
