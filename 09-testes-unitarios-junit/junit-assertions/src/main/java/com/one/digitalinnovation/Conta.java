package com.one.digitalinnovation;

public class Conta {
    private static final int AGENCIA = 1;
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public static int getAgencia() {
        return AGENCIA;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    

}
