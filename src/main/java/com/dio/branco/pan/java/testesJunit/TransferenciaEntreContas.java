package com.dio.branco.pan.java.testesJunit;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0(zero)");
        }
    }
}
