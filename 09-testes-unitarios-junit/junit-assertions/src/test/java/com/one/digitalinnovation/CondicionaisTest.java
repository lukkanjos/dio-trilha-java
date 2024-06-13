package com.one.digitalinnovation;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


public class CondicionaisTest {
    
    @Test
    @DisabledOnOs(OS.WINDOWS)
    public void validarAlgoSomenteNoUsuarioLucas(){
        Assertions.assertEquals(10, 5+5);
    }
}
