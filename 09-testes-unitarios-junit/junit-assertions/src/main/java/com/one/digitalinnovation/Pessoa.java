package com.one.digitalinnovation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Hello world!
 *
 */
public class Pessoa 
{
    private String nome;
    private LocalDate dataNascimento;
    
    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.dataNascimento, LocalDate.now());
    }

    public boolean maiorDeIdade(){
        return this.getIdade() >= 18;
    }
}
