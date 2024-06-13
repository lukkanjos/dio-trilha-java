package com.one.digitalinnovation;

public class TransferenciaEntreContas {
    
    public void transferir(Conta contaOrigem, Conta contaDestino, double valor){
        if(valor <= 0)
            throw new IllegalArgumentException("Valor deve ser maior que zero");
    }
}
