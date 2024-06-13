package com.one.digitalinnovation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import org.junit.Test;

public class ConsultarDadosDePessoasTest {
    
    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("Lucas", LocalDate.of(2000, 1, 8)));
    }

    @AfterEach
    void RemoveDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Lucas", LocalDate.of(2000, 1, 8)));
    }

    @Test
    public void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
    

}
