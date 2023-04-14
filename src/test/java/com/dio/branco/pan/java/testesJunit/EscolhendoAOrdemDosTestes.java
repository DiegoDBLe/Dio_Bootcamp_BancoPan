package com.dio.branco.pan.java.testesJunit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) Passa a ordem em cada método com @Order(1).
//@TestMethodOrder(MethodOrderer.MethodName.class) //Executa de acordo com ordem Alfabetica A-Z
//@TestMethodOrder(MethodOrderer.Random.class) // Executa de forma aleatoria.
@TestMethodOrder(MethodOrderer.DisplayName.class)// Executa de acordo com o nome passado @DisplayName("com ordem Alfabetica A-Z")
public class EscolhendoAOrdemDosTestes {

    @Order(4)
    @DisplayName("Teste A")
    @Test
    void validarFluxoA(){
        assertTrue(true);
        System.out.println("Teste Fluxo A");
    }
    @Order(3)
    @DisplayName("Teste B")
    @Test
    void validarFluxoB(){
        assertTrue(true);
        System.out.println("Teste Fluxo B");
    }
    @Order(2)
    @DisplayName("Teste C")
    @Test
    void validarFluxoC(){
        assertTrue(true);
        System.out.println("Teste Fluxo C");
    }
    @Order(1)
    @DisplayName("Teste D")
    @Test
    void validarFluxoD(){
        assertTrue(true);
        System.out.println("Teste Fluxo D");
    }

}
