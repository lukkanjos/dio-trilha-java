package com.one.digitalinnovation;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    public void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "sampa", "sampaoli", "simpa", "sampimba");
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Lucas", "11111", LocalDate.now(), "00000");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("00000")).thenReturn(dadosLocalizacao);

        Assertions.assertEquals("Lucas", pessoa.getNome());
        Assertions.assertEquals("11111", pessoa.getDocumento());
        Assertions.assertEquals("simpa", pessoa.getEndereco().getComplemento());
        Assertions.assertEquals("sampimba", pessoa.getEndereco().getBairro());

    }

}
