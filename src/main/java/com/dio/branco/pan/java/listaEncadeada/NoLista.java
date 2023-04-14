package com.dio.branco.pan.java.listaEncadeada;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class NoLista<T> {

    private T conteudo;
    private NoLista proximoNo;

    public NoLista() {
        this.proximoNo = null;
    }

    public NoLista(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public NoLista(T conteudo, NoLista proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public String toStringPesonalizado(){
        String str = "No{" +
                "conteudo=" + conteudo +
                "}";

        if (proximoNo != null){
            str += "->" + proximoNo.toString();
        }else {
            str += "-> null";
        }
        return str;
    }
}
