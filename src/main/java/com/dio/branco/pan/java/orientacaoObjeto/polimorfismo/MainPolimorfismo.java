package com.dio.branco.pan.java.orientacaoObjeto.polimorfismo;

public class MainPolimorfismo {

    public static void main(String[] args) {

        Mae[] classes = new Mae[]{new Filha1(), new Filha2(), new Mae()};

        // Sobrescrita com Polimorfismo pois aqui estamos fazendo a sobrescrita do método da classe mãe.
        for (Mae classe: classes) {
            classe.metodo1();
        }

        System.out.println();

        // Sobrescrita com Polimorfismo pois aqui estamos fazendo a sobrescrita do método da classe mãe.
        for (Mae classe: classes) {
            classe.metodo2();
        }

        System.out.println();

        // Sobrescrita pura. Pois pegamos o método que sobrescrevemos e estamos usando direto na classe filha
        Filha2 filha2 = new Filha2();
        filha2.metodo2();
    }
}
