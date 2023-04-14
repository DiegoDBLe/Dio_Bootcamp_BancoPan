package com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio;

import lombok.Data;

@Data
public abstract class Conteudo {
    private String titulo;
    private String descricao;

    public static final double XP_PADRAO = 10d;

    public abstract double calcularXp();
}
