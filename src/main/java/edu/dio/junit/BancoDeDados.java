package edu.dio.junit;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Iniciou a conexão!");
    }

    public static void finalizouConexao() {
        //fez algo
        LOGGER.info("Finalizou a conexão");
    }
}

