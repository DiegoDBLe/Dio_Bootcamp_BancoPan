package com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BootcampTest {

    private Bootcamp bootcamp;
    private Dev dev1;
    private Dev dev2;
    private Dev dev3;

    @BeforeEach
    public void inicializar() {
        bootcamp = new Bootcamp();
        dev1 = new Dev();
        dev1.setNome("João");
        dev2 = new Dev();
        dev2.setNome("Maria");
        dev3 = new Dev();
        dev3.setNome("Pedro");
    }

    @Test
    public void testarAvaliacaoValida() {
        bootcamp.setAvaliacao(8);
        Assertions.assertEquals(8, bootcamp.getAvaliacao());
    }

    @Test
    public void testarAvaliacaoInvalida() {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setAvaliacao(15);
        Assertions.assertThrows(IllegalArgumentException.class, bootcamp::getAvaliacao);
    }

    @Test
    public void testarListarParticipantes() {
        List<Dev> listaEsperada = new ArrayList<>();
        listaEsperada.add(dev1);
        listaEsperada.add(dev2);
        listaEsperada.add(dev3);
        bootcamp.listarParticipantes(dev1);
        bootcamp.listarParticipantes(dev2);
        bootcamp.listarParticipantes(dev3);
        Assertions.assertEquals(listaEsperada, bootcamp.getListaDevs());
    }

}