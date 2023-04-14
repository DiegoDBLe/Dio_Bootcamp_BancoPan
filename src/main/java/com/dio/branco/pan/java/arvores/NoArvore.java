package com.dio.branco.pan.java.arvores;

import lombok.Data;
import lombok.ToString;

/*
    Posição dos nós:
     []-> Nó raiz
     Mairores ficam à direita do no raiz
     Menores ficam à esquerda do no raiz.
* */
@Data
@ToString
public class NoArvore<T extends Comparable<T>> {

    private T conteudo;
    private NoArvore<T> noDireita;
    private NoArvore<T> noEsquerda;

    public NoArvore() {
    }

    public NoArvore(T conteudo) {
        this.conteudo = conteudo;
        this.noEsquerda = this.noDireita = null;
    }
}
