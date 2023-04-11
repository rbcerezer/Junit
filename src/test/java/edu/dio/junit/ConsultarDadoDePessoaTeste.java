package edu.dio.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConsultarDadoDePessoaTeste {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();


    }

    @Test
    void ValidarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizouConexao() {
        BancoDeDados.finalizouConexao();

    }
}
