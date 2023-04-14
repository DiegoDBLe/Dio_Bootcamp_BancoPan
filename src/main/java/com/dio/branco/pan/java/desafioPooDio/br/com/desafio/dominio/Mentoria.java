package com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
