package com.dio.branco.pan.java.equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class MainCarro {

    public static void main(String[] args) {

        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("Ford"));
        carroList.add(new Carro("Chevrolet"));
        carroList.add(new Carro("Volksvagem"));

        System.out.println("Tem o carro ford: " + carroList.contains(new Carro("Ford")));
        System.out.println("Tem o carro ford: " + new Carro("Ford").hashCode());
        System.out.println("Tem o carro ford: " + new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Ford");
        Carro carro3 = new Carro("Fiat");

        System.out.println(carro1.equals(carro3));



    }
}
