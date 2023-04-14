package com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Curso extends Conteudo{

       private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
