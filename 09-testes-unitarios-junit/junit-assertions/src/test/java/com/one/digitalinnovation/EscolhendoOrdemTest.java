package com.one.digitalinnovation;

import org.junit.Test;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTest{
    
    @Test 
    @DisplayName("C")
    public void validaTesteA(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("B")
    public void validaTesteB(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("A")
    public void validaTesteC(){
        Assertions.assertTrue(true);
    }
}