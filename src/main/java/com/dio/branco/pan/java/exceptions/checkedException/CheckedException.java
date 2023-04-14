package com.dio.branco.pan.java.exceptions.checkedException;

import javax.swing.*;
import java.io.*;

/* Leitura de arquivo que mostra no console. Testa exceptions do tipo Checked ou seja usamos Classes, instancias
    ou métodos que precisam assinar classes de Exception ou seja que lançam exceptons */
public class CheckedException {
    public static void main(String[] args){

        String nomeDoArquivo = "romance-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException exception){ // Erro de leitura ou escrita do arquivo.
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo: " + exception.getCause());
        }catch (IOException exception) { // nome do arquivo errado
            exception.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado! Contate suporte : " + exception.getCause());
        }finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        // Pega o arquivo
        File file = new File(nomeDoArquivo);

        // Cria um Buffer do arquivo e faz a leitura de linha por linha
        BufferedReader reader = new BufferedReader(new FileReader(file.getName()));
        String line = reader.readLine();

        // Abri o console para seja imprimido o arquivo no console
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // Faz a escrita de linha por linha;
        do {
            writer.write(line);
            writer.newLine();
            line = reader.readLine();
        }while (line != null);
        writer.flush();
        writer.close();
    }
}
