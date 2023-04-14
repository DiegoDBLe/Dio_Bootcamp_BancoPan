package com.dio.branco.pan.java.testesJunit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    @Test
    void deveCalcularIdadeDePessoa(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020,4,12));
        Assertions.assertEquals(3, pessoa.getIdade());

        Pessoa pessoa1 = new Pessoa("Julia", LocalDate.of(2000,4,12));
        Assertions.assertEquals(23, pessoa1.getIdade());
    }
    @Test
    void deveRetornarNaoEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020,4,12));
        Assertions.assertFalse(pessoa.ehMaiorDeIdade());
    }
    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa1 = new Pessoa("Julia", LocalDate.of(2000,4,12));
        Assertions.assertTrue(pessoa1.ehMaiorDeIdade());
    }
}