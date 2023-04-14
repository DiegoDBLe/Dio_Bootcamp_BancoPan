package com.dio.branco.pan.java.list;

import java.util.ArrayList;
import java.util.List;

public class MainCarroList {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("Fiat"));
        carros.add(new Carro("Peugeot"));

        System.out.println("Tem: " + carros.contains(new Carro("Ford")));

        System.out.println("Carro da posição 3: " + carros.get(2));
        System.out.println(carros.indexOf(new Carro("Peugeot")));
        System.out.println("Removendo -> " + carros.remove(2));
        System.out.println(carros);


    }
}
