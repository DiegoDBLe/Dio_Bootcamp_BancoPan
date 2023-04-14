package com.dio.branco.pan.java.estruturaDeDados.generics;

public class MainNoGeneric {

    public static void main(String[] args) {
        NoGeneric<String> no1 = new NoGeneric<>("Conteúdo no1");

        NoGeneric<String> no2 = new NoGeneric<>("Conteúdo no2");
        no1.setProximoNo(no2);

        NoGeneric<String> no3 = new NoGeneric<>("Conteúdo no3");
        no2.setProximoNo(no3);

        NoGeneric<String> no4 = new NoGeneric<>("Conteúdo no4");
        no3.setProximoNo(no4);

        //no1->no2->no3->no4->null
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("--------------------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());



    }
}
