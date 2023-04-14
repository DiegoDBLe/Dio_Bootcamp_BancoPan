package com.dio.branco.pan.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainCarroMap {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome: ", "João");
        aluno.put("Idade: ", "18");
        aluno.put("Média: ", "8.0");
        aluno.put("Turma: ", "3a");

        System.out.println("-> " + aluno);

        System.out.println("-> " + aluno.keySet());
        System.out.println("-> " + aluno.values());


        List< Map<String, String>> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome: ", "Maria");
        aluno2.put("Idade: ", "18");
        aluno2.put("Média: ", "9.0");
        aluno2.put("Turma: ", "3b");

        listaAlunos.add(aluno2);

        System.out.println("-> " + listaAlunos);


        // Contém o objeto aluno na lista de alunos?
        System.out.println("-> " + listaAlunos.contains(aluno));

        // Contém no objeto aluno a chave Nome: ?
        System.out.println("-> " + aluno2.containsKey("Nome: "));



    }
}
