package com.dio.branco.pan.java.debug;

public class MainDebug {
    public static void main(String[] args) {
        System.out.println("Iniciou o propragam no método main.");
        a();
        System.out.println("FInalizou o propragam pelo método main.");
    }
    static void a() {
        System.out.println("Entrou no método a().");
        b();
        System.out.println("FInalizou o método a().");
    }
    static void b() {
        System.out.println("Entrou no método b().");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("FInalizou o método b().");

    }
    static void c() {
        System.out.println("Entrou no método c().");
        //Thread.dumpStack();
        System.out.println("FInalizou o método c().");
    }
}
