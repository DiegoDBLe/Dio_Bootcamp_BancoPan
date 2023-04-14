package com.dio.branco.pan.java.metodos;

public class MainMetodos {

    public static void main(String[] args) {

        // Calculadora
        MetodoCalculadora.soma(5,10);
        MetodoCalculadora.subtracao(5,10);
        MetodoCalculadora.multiplicacao(5,10);
        MetodoCalculadora.divisao(5,10);

        System.out.println(" ");

        // Mensagem
        MetodoMensagem.obterMensagem(9);
        MetodoMensagem.obterMensagem(13);
        MetodoMensagem.obterMensagem(23);
        MetodoMensagem.obterMensagem(60);

        System.out.println(" ");

        // Emprestimo
        MetodoEmprestimo.calcular(100,2);
        MetodoEmprestimo.calcular(100,3);
        MetodoEmprestimo.calcular(100,MetodoEmprestimo.getDuasParcelas());
        MetodoEmprestimo.calcular(100,MetodoEmprestimo.getTresParcelas());
        MetodoEmprestimo.calcular(100,4);

        System.out.println();

        // Sobrecarga de Métodos:
        MetodoQuadrilatero.area(4);
        MetodoQuadrilatero.area(4, 4);
        MetodoQuadrilatero.area(7, 8,9);
        MetodoQuadrilatero.area(4f,4f);


        System.out.println();
        System.out.println(true);
        System.out.println(2);
        System.out.println(2.0);
        System.out.println();
        System.out.println(" ");
        System.out.println(" Sobrecarga de métodos");

        System.out.println();
        // Método com retorno:
        MetodosComRetorno.area(4);
        double areaDoQuadrado = MetodosComRetorno.area(5,4);
        System.out.println(areaDoQuadrado);

    }
}
