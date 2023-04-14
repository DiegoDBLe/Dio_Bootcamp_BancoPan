package com.dio.branco.pan.java.basico.smart;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está: ".concat( smartTv.ligada ? "Ligada":"Desligada"));
        System.out.println("Canal Atual: : " + smartTv.canal);
        System.out.println("Volume Atual: : " + smartTv.volume);

        smartTv.tela();

        smartTv.ligar();
        System.out.println("Tv está: ".concat( smartTv.ligada ? "Ligada":"Desligada"));
        System.out.println("Canal Atual: : " + smartTv.canal);
        System.out.println("Volume Atual: : " + smartTv.volume);

        smartTv.tela();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(10);

        System.out.println("Tv está: ".concat( smartTv.ligada ? "Ligada":"Desligada"));
        System.out.println("Canal Atual: : " + smartTv.canal);
        System.out.println("Volume Atual: : " + smartTv.volume);
    }
}
