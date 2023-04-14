package com.dio.branco.pan.java.testesJunit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Verifica ser o usuario é o mesmo passado no parametro e se for ele executa o teste, caso contrario
*  apresenta erro;
*  Ou seja a segunda condição so sera executada dependendo daprimeira.
* */
public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteSeUsuarioDaMaquinaForDiferente(){
        Assumptions.assumeFalse("deigo".equals(System.getenv("USER")));
        assertEquals(10, 5 + 5);
    }
}
