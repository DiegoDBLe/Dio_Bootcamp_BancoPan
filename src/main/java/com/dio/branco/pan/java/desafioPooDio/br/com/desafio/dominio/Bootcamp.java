package com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.*;

@Data
@EqualsAndHashCode
public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private List<Dev> listaDevs = new ArrayList<>();

    private int avaliacao;

    public int getAvaliacao() {
        if (avaliacao < 0 || avaliacao > 10) {
            throw new IllegalArgumentException("Avaliação deve estar entre 0 e 10");
        }
        System.out.print("Avaliação: ");
        for (int i = 0; i < avaliacao; i++) {
            System.out.print("*");
        }
        System.out.print(" ");
        return avaliacao;
    }

    public List<Dev> listarParticipantes(Dev dev){
        listaDevs.add(dev);
        for (Dev dev1: listaDevs) {
            System.out.println("-> " +dev1.getNome());
        }
        return this.listaDevs;
    }
}
