package com.dio.branco.pan.java.listaDuplamenteEncadeada;

public class MainListaDuplaEncadeada {

    public static void main(String[] args) {

        ListaDuplaEncadeada<String> lista = new ListaDuplaEncadeada<>();
        lista.add("No1");
        lista.add("No2");
        lista.add("No3");
        lista.add("No4");
        lista.add("No5");
        lista.add("No6");
        lista.add("No7");

        System.out.println("Lista" + lista);

        lista.remove(2);
        System.out.println("Lista" + lista);

        lista.add(2,"No3");
        System.out.println("Lista" + lista);
        System.out.println("Lista" + lista.get(6));

    }
}
