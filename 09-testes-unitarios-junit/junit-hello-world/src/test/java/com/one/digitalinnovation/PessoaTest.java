package com.one.digitalinnovation;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PessoaTest {

    @Test
    public void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Lucas", LocalDate.of(2005, 7, 2));
        Assertions.assertEquals(18, pessoa.getIdade());
    }
}
