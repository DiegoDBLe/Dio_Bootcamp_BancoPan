package com.dio.branco.pan.java.testesJunit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondicionaisTest {

    @Test
    @DisabledIfEnvironmentVariable(named = "User", matches = "deigo")
    void validarAlgoSomenteSeUsuarioDaMaquinaForDiferenteDoParametro(){
        assertEquals(10, 5 + 5);
    }
    @Test
    @EnabledIfEnvironmentVariable(named = "USERDOMAIN_ROAMINGPROFILE", matches = "DIEGODB")
    void validarAlgoSomenteSeUsuarioDaMaquinaForIgualAoDoParametro(){
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteSeSistemaOperacionalDaMaquinaForIgualDoParametro(){
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validaSomenteNaJreConfigurada(){
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_17, max = JRE.JAVA_19)
    void validaSomenteNaJreConfiguradaMinEMax(){
        assertEquals(10, 5 + 5);
    }
}
