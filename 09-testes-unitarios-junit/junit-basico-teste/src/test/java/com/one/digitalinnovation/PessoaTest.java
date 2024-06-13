package com.one.digitalinnovation;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class PessoaTest 
{
    Pessoa pessoa = new Pessoa("Lucas", LocalDate.of(2005, 7, 2));

    @Test
    public void validarMaiorDeIdade(){
        Assertions.assertTrue(pessoa.maiorDeIdade());
    }

}
