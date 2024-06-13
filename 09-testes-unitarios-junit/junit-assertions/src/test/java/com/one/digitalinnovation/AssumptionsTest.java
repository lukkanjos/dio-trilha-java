package com.one.digitalinnovation;

import org.junit.Assume;
import org.junit.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class AssumptionsTest {
    
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Lucas")
    public void validarAlgoSomenteNoUsuarioLucas(){
        Assume.assumeFalse("root".equals(System.getenv("USER")));
    }
}
