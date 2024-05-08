package org.example;

public class Conta implements AtualizaConta {
    protected double saldo;

    public double getSaldo(double valor){
        return saldo;
    }
    public void depositar(double valor){
        this.saldo -= saldo;
    }

    public void sacar(double valor){
        this.saldo -= saldo;
    }

    @Override
    public void atualizaConta(double taxa){

    }
}
