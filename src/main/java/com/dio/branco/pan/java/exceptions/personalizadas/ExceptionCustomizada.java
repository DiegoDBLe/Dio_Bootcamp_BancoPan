package com.dio.branco.pan.java.exceptions.personalizadas;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {

    public static void main(String[] args) throws IOException {

        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        try {

            // Cria um Buffer do arquivo e faz a leitura de linha por linha
            BufferedReader reader = lerArquivo(nomeDoArquivo);
            String line = reader.readLine();

            // Abri o console para seja imprimido o arquivo no console
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

            // Faz a escrita de linha por linha;
            do {
                writer.write(line);
                writer.newLine();
                line = reader.readLine();
            } while (line != null);
            writer.flush();
            writer.close();
        } catch (IOException | ImpossivelAberturaDeArquivoException exception) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, por favor, " +
                    "contate o suporte." + exception.getMessage());
            exception.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        // Leirura do arquivo:
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}
