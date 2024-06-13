package com.one.digitalinnovation;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionsTest {
    
    @Test
    public void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta(2, 0);
        Conta contaDestino = new Conta(3, 0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transferir(contaOrigem, contaDestino, -1));
    }
}
