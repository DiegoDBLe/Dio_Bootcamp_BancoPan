package com.dio.branco.pan.java.estruturaDeDados.pilhas;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class NoPilhas {

    private int dados;

    private NoPilhas noPilhas;

    public NoPilhas() {
    }

    public NoPilhas(int dados) {
        this.dados = dados;
    }


}
