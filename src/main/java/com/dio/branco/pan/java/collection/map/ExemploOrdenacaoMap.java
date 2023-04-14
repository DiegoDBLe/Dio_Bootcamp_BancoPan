package com.dio.branco.pan.java.collection.map;

import java.util.*;

/* Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro):

Autor = Hawkin, Stephen - Livro = nome: Uma Breve História do Tempo. Paginas: 256
Autor = Duhigg, Charles - Livro = nome: O poder do Hábito. Paginas: 408
Autor = DHarai, Yuval Noah - Livro = nome: 21 lições Para o século 21. Paginas: 432

*
* */
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        // Criando um MAP Ordem Aleatória (HashMap):
        System.out.println("Ordem Aleatória: ");
        Map<String, Livros> meusLivros = new HashMap<>(){{
            put("Hawkin, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O poder do Hábito", 408));
            put("DHarai, Yuval Noah", new Livros("21 lições Para o século 21.", 432));
        }};
        System.out.println("-> " + meusLivros);

        // Imprimir organizado percorrendo cada Map com o Map.Entry:
        for (Map.Entry<String, Livros> livro: meusLivros.entrySet()){
            System.out.println("Autor -> " + livro.getKey() + " Livro: " + livro.getValue().getNome()
                    + " páginas: " + livro.getValue().getPaginas());
        }

        System.out.println();
        // Ordem de Inserção é com LinkdHashMap:
        System.out.println("Ordem de Inserção: ");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawkin, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O poder do Hábito", 408));
            put("DHarai, Yuval Noah", new Livros("21 lições Para o século 21.", 432));
        }};
        System.out.println("-> " + meusLivros1);

        // Imprimir organizado percorrendo cada Map com o Map.Entry:
        for (Map.Entry<String, Livros> livro: meusLivros1.entrySet()){
            System.out.println("Autor -> " + livro.getKey() + " Livro: " + livro.getValue().getNome()
                    + " páginas: " + livro.getValue().getPaginas());
        }

        System.out.println();
        // Ordem alfabetica é com treeMap:
        System.out.println("Ordem alfabetica pelos autores: ");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livros> livro: meusLivros2.entrySet()){
            System.out.println("Autor -> " + livro.getKey() + " Livro: " + livro.getValue().getNome()
                    + " páginas: " + livro.getValue().getPaginas());
        }

        System.out.println();
        // Ordem alfabetica é com treeMap nomes do livros:
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livros> livro: meusLivros3){
            System.out.println("Autor -> " + livro.getKey() + " Livro: " + livro.getValue().getNome()
                    + " páginas: " + livro.getValue().getPaginas());
        }





    }
}
