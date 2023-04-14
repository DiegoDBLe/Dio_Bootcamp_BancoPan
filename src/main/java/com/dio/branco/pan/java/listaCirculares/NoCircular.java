package com.dio.branco.pan.java.listaCirculares;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class NoCircular<T> {

    private T conteudo;
    private NoCircular<T> noProximo;

    public NoCircular(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }
}
