package com.dio.branco.pan.java.orientacaoObjeto.oo;
/* POO (Paradigma de Orienteção a Objeto):
- Paradigma: Modelo, Exemplo a ser seguido;
- Programação: Desenvolvimento de uma apliação;
- Orientada: Aquilo que é regido; segue uma orientação;
- Objeto: im molde que representa uma determinada classe

Paradgima de Programação Orientado a Objetos: É um modelo de desenvolvimento de aplicações, sendo
este modelo construido acerca de conceito de objetos;
* */
public class CarroObj {

    private String cor;
    private String modelo;
    private int capacidadeTanque;

    public CarroObj(){

    }
    public CarroObj(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque(){
        return this.capacidadeTanque;
    }

    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
