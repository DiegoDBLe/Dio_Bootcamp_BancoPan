package com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    private Curso curso;

    @BeforeEach
    public void inicializar() {
        curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Aprenda Java do zero");
        curso.setCargaHoraria(40);
    }

    @Test
    public void testarCalcularXp() {
        double xpEsperado = 40 * 10; // 10 é o XP padrão definido em Conteudo
        double xpCalculado = curso.calcularXp();
        Assertions.assertEquals(xpEsperado, xpCalculado);
    }

}