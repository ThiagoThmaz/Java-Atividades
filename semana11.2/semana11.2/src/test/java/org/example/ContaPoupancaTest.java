package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void teste_depositar_conta_poupanca() {
        ContaPoupanca contaPoupancaMock = new ContaPoupanca();
        contaPoupancaMock.depositar(100);
    }

    @Test
    void teste_atualizar_conta_poupanca(){
        ContaPoupanca contaPoupancaMock = new ContaPoupanca();
        contaPoupancaMock.atualizaConta(1);
    }
}