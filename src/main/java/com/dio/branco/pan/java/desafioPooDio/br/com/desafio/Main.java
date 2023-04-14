package com.dio.branco.pan.java.desafioPooDio.br.com.desafio;

import com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio.Bootcamp;
import com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio.Curso;
import com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio.Dev;
import com.dio.branco.pan.java.desafioPooDio.br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        System.out.println("*-*-*-*-********************************");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JaavaScript");
        curso2.setDescricao("Descrição JavaScript");
        curso2.setCargaHoraria(6);

        System.out.println("*-*-*-*-********************************");
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println("- > " + curso);
        System.out.println("- > " + curso2);
        System.out.println("- > " + mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer BancoPan!");
        bootcamp.setDescricao("Descrição do bootecamp Java Developer BancoPan. ");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.setAvaliacao(6);



        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverNoBootcam(bootcamp);

        System.out.println("Conteudos Inscritos: Aluno: "+
                devDiego.getNome() + " -> " + devDiego.getConteudosInscritos());
        devDiego.progredir();
        devDiego.progredir();
        System.out.println("Conteudos Inscritos: Aluno: "+
                devDiego.getNome() + " -> " + devDiego.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos Concluidos: Aluno: "+
                devDiego.getNome() + " -> " + devDiego.getConteudosConcluidos());
        System.out.println("XP: " + devDiego.calcularTotalXp());
        System.out.println(bootcamp.getAvaliacao());

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        Dev devmaria = new Dev();
        devmaria.setNome("Maria");
        devmaria.inscreverNoBootcam(bootcamp);

        System.out.println("Conteudos Inscritos: Aluno: "+
                devmaria.getNome() + " -> " + devmaria.getConteudosInscritos());

        devmaria.progredir();
        System.out.println("Conteudos Inscritos: Aluno: "+
                devmaria.getNome() + " -> " + devmaria.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos Concluidos: Aluno: "+
                devmaria.getNome() + " -> " + devmaria.getConteudosConcluidos());
        System.out.println("XP: " + devmaria.calcularTotalXp());

        bootcamp.listarParticipantes(devDiego);
        bootcamp.listarParticipantes(devmaria);
        System.out.println("->" + bootcamp.getListaDevs());
    }
}
