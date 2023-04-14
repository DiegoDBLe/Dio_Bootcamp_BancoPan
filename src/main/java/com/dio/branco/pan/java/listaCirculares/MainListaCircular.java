package com.dio.branco.pan.java.listaCirculares;

public class MainListaCircular {

    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("C0");
        System.out.println(listaCircular);

        listaCircular.remove(0);
        System.out.println(listaCircular);

        listaCircular.add("C1");
        System.out.println(listaCircular);

        listaCircular.add("C2");
        listaCircular.add("C3");
        System.out.println(listaCircular);

        System.out.println(listaCircular.get(0));
        System.out.println(listaCircular.get(1));
        System.out.println(listaCircular.get(2));
        System.out.println(listaCircular.get(3));
        System.out.println(listaCircular.get(4));
        System.out.println(listaCircular.get(5));

        System.out.println(" ");

        for(int i=0; i < 20; i++){
            if(listaCircular.get(i).equals(listaCircular.get(3))){
                System.out.println("*-*-*-*-* ");
            }
            System.out.println("-> " + listaCircular.get(i));
        }
    }
}
