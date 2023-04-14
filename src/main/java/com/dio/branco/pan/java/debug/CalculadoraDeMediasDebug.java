package com.dio.branco.pan.java.debug;

import java.util.Scanner;

public class CalculadoraDeMediasDebug {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcladoraMediaDaTurma(alunos, scanner);

        System.out.printf("Média da turma %.1f: ", media);

    }

    private static double calcladoraMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno: alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
