package com.dio.branco.pan.java.basico.operadores;

public class OperadorLogico {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("V && V =  " + verdadeiro);
        System.out.println("V && F =  " + falso);
        System.out.println("F && V =  " + falso);
        System.out.println("F && F =  " + falso);

        System.out.println("----------------------------------------------------------------");

        System.out.println("V || V =  " + verdadeiro);
        System.out.println("V || F =  " + verdadeiro);
        System.out.println("F || V =  " + verdadeiro);
        System.out.println("F || F =  " + falso);

        System.out.println("----------------------------------------------------------------");

        System.out.println("V ^ V =  " + falso);
        System.out.println("V ^ F =  " + verdadeiro);
        System.out.println("F ^ V =  " + verdadeiro);
        System.out.println("F ^ F =  " + falso);

        System.out.println("----------------------------------------------------------------");

        System.out.println("!F =  " + verdadeiro);
        System.out.println("!V =  " + falso);

        System.out.println("----------------------------------------------------------------");

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2" + (b1 && b2));
        System.out.println("b1 && b3" + (b1 && b3));

        System.out.println("b2 || b3" + (b2 || b3));
        System.out.println("b2 || b4" + (b2 || b4));

        System.out.println("b1 ^ b3" + (b1 ^ b3));
        System.out.println("b4 ^ b1" + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1)" + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe auxilio: " + recebeAuxilio);
    }


}
