package edu.dio.junit;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;
//trazer o import Assertions mais para perto da classe.
//coloca * no final para incluir toda a biblioteca de asserts.
//quando torna o import "Static" não precisa escrever Assertions, antes no .assertxxxxx
public class AssertionsTeste {
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,5, 30, 40, 50};
        int[] segundoLancamento = {10,5, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
        // antes: Assertions.assertArrayEquals(...);
    }

    @Test
    void ValidarSeObjetoEstaNull() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Thiago", LocalDateTime.now());

        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

       assertEquals(valor, outroValor);
    }
}
