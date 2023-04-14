package com.dio.branco.pan.java.listaDuplamenteEncadeada;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }
}
