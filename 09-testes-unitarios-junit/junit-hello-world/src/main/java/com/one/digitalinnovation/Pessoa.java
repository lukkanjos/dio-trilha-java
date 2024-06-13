package com.one.digitalinnovation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
        return this.nome;
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.dataNascimento, LocalDate.now());
    }
    
}
