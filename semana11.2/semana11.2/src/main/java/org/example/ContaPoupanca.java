package org.example;

public class ContaPoupanca extends Conta{
    @Override
    public void atualizaConta(double taxa){
        taxa = taxa / 100;
        this.saldo += getSaldo(saldo) * taxa * 3;
    }

}
