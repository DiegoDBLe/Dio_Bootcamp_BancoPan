package com.dio.branco.pan.java.stack;

import com.dio.branco.pan.java.equalsHashCode.Carro;

import java.util.Stack;

public class MainCarroStack {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new com.dio.branco.pan.java.equalsHashCode.Carro("Ford"));
        stackCarros.push(new com.dio.branco.pan.java.equalsHashCode.Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println("Stack: " + stackCarros);
        System.out.println("Apagando pop()->: " + stackCarros.pop());
        System.out.println("Stack: " + stackCarros);

        System.out.println(" ");

        System.out.println("Mostrando peek()->: " + stackCarros.peek());
        System.out.println("Stack: " + stackCarros);

        System.out.println("Stack está vazia isEmpty() ? " + stackCarros.isEmpty());
    }
}
