package edu.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa rafael = new Pessoa("Rafael", LocalDateTime.of(2001,1,1,15,00));
        Assertions.assertEquals(22, rafael.getIdade());

    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa rafael = new Pessoa("Rafael", LocalDateTime.of(2001,1,1,15,00));
        Assertions.assertTrue(rafael.ehMaiorIdade());

        Pessoa joao = new Pessoa ("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorIdade());


    }
}
