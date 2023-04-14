package com.dio.branco.pan.java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainCarroQueue {

    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println("Mostrando o primeiro da fila:->  " + queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println("pega o primeiro e removendo da fila:->  " + queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println("Tamanho da fila:->  " + queueCarros.size());
        System.out.println(queueCarros);
    }
}
