package com.one.digitalinnovation;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTest {
    
    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    public void verificarComportamentoDaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem);

        Mensagem mensagem = new Mensagem("olá");
        enviarMensagem.adicionarMensagem(mensagem);

        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

        Assertions.assertFalse(enviarMensagem.getMensagems().isEmpty());
    }
}
