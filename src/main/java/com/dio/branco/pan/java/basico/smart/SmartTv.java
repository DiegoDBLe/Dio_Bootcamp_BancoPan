package com.dio.branco.pan.java.basico.smart;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void aumentarVolume(){
        this.volume += 2;
        System.out.println("Aumentando Volume... " + this.volume);
    }

    public void diminuirVolume(){
        this.volume -= 2;
        System.out.println("Baixando Volume... " + this.volume);
    }

    public void mudarCanalPraCima(){
        this.canal += 1;
        System.out.println("Mudando Canal... " + this.canal);
    }

    public void mudarCanalPraBaixo(){
        this.canal -= 1;
        System.out.println("Mudando Canal..." + this.canal);
    }

    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
        System.out.println("Mudando Canal...: " + this.canal);
    }

    public void tela(){
        System.out.println("------------------------------------------------");
        System.out.println("");
    }
}
