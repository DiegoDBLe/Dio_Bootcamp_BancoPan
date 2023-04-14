package com.dio.branco.pan.java.orientacaoObjeto.oo;

public class MainCarroObj {

    public static void main(String[] args) {

        CarroObj carroObj = new CarroObj();
        carroObj.setCor("Azul");
        carroObj.setModelo("HRV");
        carroObj.setCapacidadeTanque(80);

        System.out.println("Modelo: " + carroObj.getModelo());
        System.out.println("Cor: " + carroObj.getCor());
        System.out.println("Capacidade do Tanque: " + carroObj.getCapacidadeTanque() + "Lts");
        System.out.println("Valot total para encher o Tanque: " + carroObj.totalValorTanque(6.00));
        System.out.println();

        CarroObj carro2 = new CarroObj("Preto", "HRV", 80);
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade do Tanque: " + carro2.getCapacidadeTanque() + "Lts");
        System.out.println("Valot total para encher o Tanque: " + carro2.totalValorTanque(5.00));

    }
}
