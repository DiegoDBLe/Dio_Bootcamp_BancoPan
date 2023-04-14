package com.dio.branco.pan.java.listaEncadeada;

public class MainLista {

    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.add("Teste1");
        lista.add("Teste2");
        lista.add("Teste3");
        lista.add("Teste4");

        System.out.println("Lista: " + lista);
        System.out.println("Indice: " + lista.get(0));
        System.out.println("Indice: " + lista.get(1));
        System.out.println("Indice: " + lista.get(2));
        System.out.println("Indice: " + lista.get(3));

        System.out.println("removendo o indice: " + lista.remove(1));
        System.out.println("Indice: " + lista);

    }
}
