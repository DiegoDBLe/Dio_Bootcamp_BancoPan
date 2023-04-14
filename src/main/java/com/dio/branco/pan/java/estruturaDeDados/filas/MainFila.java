package com.dio.branco.pan.java.estruturaDeDados.filas;

public class MainFila {

    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();
        fila.enqueue("Primeiro da Fila");
        fila.enqueue("Segundo da Fila");
        fila.enqueue("Terceiro da Fila");
        fila.enqueue("Quarto da Fila");

        System.out.println(fila);

        System.out.println(fila.dequeue());

        System.out.println(fila);

        fila.enqueue("Ultimo da Fila");
        System.out.println(fila);

        System.out.println(fila.first());
        System.out.println(fila);
    }
}
