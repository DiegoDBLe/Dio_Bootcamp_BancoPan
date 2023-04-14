package com.dio.branco.pan.java.basico.loops;

import java.util.Scanner;

/*
*   FAÇA UM PROGRAMA QUE LEIA CONJUNTOS DE DOIS VALORES,
*   O PRIMEIRO REPRESENTANDO O NOME DO ALUNO E O SEGUNDO REPRESENTANDO A SUA IDADE.
*   (PARE O PROGRAMA INSERINDO O VALOR 0 NO CAMPO NOME).
* */
public class Exercicio_NomeEIdade {

    public static void main(String[] args) throws InterruptedException {
        String nome;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do Aluno: ");
            nome = scanner.next().toUpperCase();
            if (nome.equals("parar".toUpperCase())){
                System.out.println("Saindo.....");
                Thread.sleep(3000);
                break;
            }
            System.out.print("Digite a idade do Aluno: ");
            int idade = scanner.nextInt();
        }
        System.out.println("Programa Finalizado com Sucesso!");
    }
}
