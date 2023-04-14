package com.dio.branco.pan.java.testesJunit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
/* @BeforeAll -> executa o método antes do ciclo de teste começar;
   @BeforeEach -> executa o método antes de acada @Test
   @AfterEach -> executa o método depois de cada @Test
   @AfterAll -> executa o método no final do ciclo dos testes;
 *
* */
class BancoDeDadosTest {

    @BeforeAll
    static void configureConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Iniciou o @BeforeAll ");
    }

    @BeforeEach
    void validarInserirPessoaNoBanco(){
        BancoDeDados.inserirNoBanco(new Pessoa("João", LocalDate.of(2002, 4, 13)));
        System.out.println("@BeforeEach° ");
    }

    @AfterEach
    void validarRemocaoDePessoaNoBanco(){
        BancoDeDados.removendoDoBanco(new Pessoa("João", LocalDate.of(2002, 4, 13)));
        System.out.println("@AfterEach ");
    }

    @Test
    void validarDadosDeRetornoDoBanco(){
        assertTrue(true);
        System.out.println("  @Test método: validarDadosDeRetornoDoBanco ");
    }

    @Test
    void validarRetornoFalse(){
        assertFalse(false);
        System.out.println("@Test método: validarRetornoFalse 3°");
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizouConexao();
        System.out.println("@AfterAll°");
    }

}