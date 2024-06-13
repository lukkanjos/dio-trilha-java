package com.one.digitalinnovation;

import java.time.LocalDate;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AssertionsTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    public void validarObjetoEstaNulo() {
        Pessoa pessoa = new Pessoa("Lucas", LocalDate.of(2005, 7, 2));

        assertNotNull(pessoa);
    }
}
