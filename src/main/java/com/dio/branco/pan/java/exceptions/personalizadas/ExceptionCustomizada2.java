package com.dio.branco.pan.java.exceptions.personalizadas;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada2 {

    public static void main(String[] args) throws IOException {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < numerador.length; i++) {
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata",
                            numerador[i], denominador[i]);
            } catch (DivisaoNaoExataException | ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            int resultado = numerador[i] / denominador[i];
            System.out.println(resultado);
        }
        System.out.println("O programa continua..");
    }
}
