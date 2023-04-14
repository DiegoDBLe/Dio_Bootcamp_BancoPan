package com.dio.branco.pan.java.testesJunit;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/* Classe test de array[]:
* 1- Se um array é igual ao outro;
* 2- Se os arrays são diferentes.
* 3- Se o objeto é null;
* 4- se o objeto NÃO é null;
* 5- Valida valores iguais de tipos diferentes.*/
public class ArrayTeste {

    @Test
    void verificaSeArraysSaoIguais(){

    int[] primeiroArray = {10, 20, 30, 40, 50};
    int[] segundoArray = {10, 20, 30, 40, 50};

    assertArrayEquals(primeiroArray, segundoArray);
    }
    @Test
    void verificaSeArraysSaoDiferentes(){

        int[] primeiroArray = {10, 20, 30, 40, 50};
        int[] segundoArray = {15, 25, 35, 45, 55};

        assertNotEquals(primeiroArray, segundoArray);

    }
    @Test
    void validarSeObjetoEstaNull(){
        Pessoa pessoa = null;

        assertNull(pessoa);
    }
    @Test
    void validarSeObjetoNaoEstaNull(){

        Pessoa pessoa = new Pessoa("joão", LocalDate.of(2023, 1,1));
        assertNotNull(pessoa);
    }
    @Test
    void validarValoresIaguisComTiposDiferentes(){
        double primeiroValor = 5.0;
        int segundoValor = 5;

        assertEquals(primeiroValor, segundoValor);
    }
}
