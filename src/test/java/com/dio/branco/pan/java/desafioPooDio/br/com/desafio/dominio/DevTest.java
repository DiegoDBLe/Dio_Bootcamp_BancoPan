package com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DevTest {

    private Dev dev;
    private Bootcamp bootcamp;

    @BeforeEach
    void setUp() {
        dev = new Dev();
        dev.setNome("John Doe");

        bootcamp = new Bootcamp();
        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();
        bootcamp.getConteudos().add(conteudo1);
        bootcamp.getConteudos().add(conteudo2);
    }

    @Test
    void testarInscreverNoBootcamp() {
        dev.inscreverNoBootcam(bootcamp);
        Assertions.assertEquals(2, dev.getConteudosInscritos().size());
        Assertions.assertTrue(bootcamp.getDevsInscritos().contains(dev));
    }

    @Test
    void testarProgredir() {
        Conteudo conteudo = bootcamp.getConteudos().stream().findFirst().orElse(null);
        if (conteudo != null) {
            dev.getConteudosInscritos().add(conteudo);
            dev.progredir();
            Assertions.assertEquals(1, dev.getConteudosConcluidos().size());
            Assertions.assertFalse(dev.getConteudosInscritos().contains(conteudo));
        } else {
            Assertions.fail("Não foi possível encontrar nenhum conteúdo no bootcamp!");
        }
    }

    @Test
    void testarCalcularTotalXp() {
        Conteudo conteudo = bootcamp.getConteudos().stream().findFirst().orElse(null);
        if (conteudo != null) {
            Set<Conteudo> conteudosConcluidos = new HashSet<>();
            conteudosConcluidos.add(conteudo);
            dev.setConteudosConcluidos(conteudosConcluidos);
            Assertions.assertEquals(conteudo.calcularXp(), dev.calcularTotalXp());
        } else {
            Assertions.fail("Não foi possível encontrar nenhum conteúdo no bootcamp!");
        }
    }

}