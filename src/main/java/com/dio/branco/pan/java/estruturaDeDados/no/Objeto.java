package com.dio.branco.pan.java.estruturaDeDados.no;

public class Objeto {

    Integer numero;

    public Objeto(Integer numero) {
        this.numero = numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.numero.toString();
    }
}
