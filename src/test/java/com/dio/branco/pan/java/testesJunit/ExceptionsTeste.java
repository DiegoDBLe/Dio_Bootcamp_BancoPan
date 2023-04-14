package com.dio.branco.pan.java.testesJunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("45678", 1000);

        TransferenciaEntreContas entreContas = new TransferenciaEntreContas();

        /* Chama o método assertThrows do Junit, passa o tipo de erro esperado, expressão lambda ()->,
         instancia de classe onde possui a exceção, chama o método que lança a exceção e passa os parametros.
         aqui espera que a exceção seja lançada.*/
        assertThrows(IllegalArgumentException.class,
                () -> entreContas.transfere(contaOrigem, contaDestino, -1));
    }

    @Test
    void validarCenarioDeNaoLancarExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("45678", 1000);

        TransferenciaEntreContas entreContas = new TransferenciaEntreContas();

        /* Aqui não espera que a exceção seja lançada */
        assertDoesNotThrow(() -> entreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
