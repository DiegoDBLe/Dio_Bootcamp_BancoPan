package com.dio.branco.pan.java.testesJunit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private LocalDate nascimento;

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }
}
