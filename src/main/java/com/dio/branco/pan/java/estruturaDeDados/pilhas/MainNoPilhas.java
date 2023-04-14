package com.dio.branco.pan.java.estruturaDeDados.pilhas;

public class MainNoPilhas {

    public static void main(String[] args) {

        Pilhas pilhas = new Pilhas();
        pilhas.push(new NoPilhas(1));
        pilhas.push(new NoPilhas(2));
        pilhas.push(new NoPilhas(3));
        pilhas.push(new NoPilhas(4));
        pilhas.push(new NoPilhas(5));

        System.out.println(pilhas);
        System.out.println(" ");

        pilhas.pop();
        System.out.println(pilhas);


    }
}
