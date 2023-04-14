package com.dio.branco.pan.java.estruturaDeDados.filas;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class NoFila<T> {

    private T object;
    private NoFila<T> refNoFila;

    public NoFila() {
    }

    public NoFila(T object) {
        this.refNoFila = null;
        this.object = object;
    }
}
