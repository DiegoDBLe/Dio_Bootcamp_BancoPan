package com.dio.branco.pan.java.testesJunit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão");
    }

    public static void inserirNoBanco(Pessoa pessoa){
        LOGGER.info("Inserindo no banco");
    }

    public static void removendoDoBanco(Pessoa pessoa){
        LOGGER.info("Removendo do banco");
    }

    public static void finalizouConexao(){
        LOGGER.info("Finalizou conexão");
    }
}
