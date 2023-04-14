package com.dio.branco.pan.java.exceptions.uncheckedException;

import javax.swing.*;

public class UnchechedException {
    public static void main(String[] args) {

        // Flag:
        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! "
                        + e.getMessage());
                //e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossivel dividir um número por 0!"
                        + e.getMessage());
            } finally {
                System.out.println("Chegou no finally!");
            }
        } while (continueLooping);

        System.out.println("Continua... ");
    }

    private static int dividir(int a, int b) {
        return a / b;
    }
}