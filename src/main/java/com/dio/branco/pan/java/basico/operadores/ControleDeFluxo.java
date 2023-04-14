package com.dio.branco.pan.java.basico.operadores;

import java.util.Scanner;

public class ControleDeFluxo {

    // Decisão: if, if-else, if-else-if, switch, e operador ternário.
    // Repetição: for,while, do while
    // Interrupção: break, continue e return

    //Ternário:
    //condição ? true: false;
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número de 1 a 12 e descubra o mês correspondete: ");
    int mes = scanner.nextInt();

    if(mes == 1) {
        System.out.println("Janeiro");
    } else if (mes == 2) {
        System.out.println("Fevereiro");
    } else if (mes == 3) {
        System.out.println("Março");
    } else if (mes == 4) {
        System.out.println("Abril");
    } else if (mes == 5) {
        System.out.println("Maio");
    } else if (mes == 6) {
        System.out.println("Junho");
    } else if (mes == 7) {
        System.out.println("Julho\nFérias...");
    } else if (mes == 8) {
        System.out.println("Agosto");
    } else if (mes == 9) {
        System.out.println("Setembro");
    } else if (mes == 10) {
        System.out.println("Outubro");
    } else if (mes == 11) {
        System.out.println("Novembro");
    } else if (mes == 12) {
        System.out.println("Dezembro");
    }else {
        System.out.println("Mês inválido");
    }

    System.out.println("----------------------------------------------------------------");

    switch (mes) {
        case 1:
        case 2:
            System.out.println("Segunda-feira");
            break;
        case 3:
            System.out.println("Terça-feira");
            break;
        case 4:
            System.out.println("Quarta-feira");
            break;
        case 5:
            System.out.println("Quinta-feira");
            break;
        case 6:
            System.out.println("Sexta-feira");
            break;
        case 7:
            System.out.println("Sabado-feira");
            break;
        case 8:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Dia inválido");
    }
    }
}
