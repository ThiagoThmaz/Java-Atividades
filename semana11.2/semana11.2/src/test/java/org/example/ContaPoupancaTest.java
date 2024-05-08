package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void teste_depositar_conta_poupanca() {
        ContaPoupanca contaPoupancaMock = new ContaPoupanca();
        contaPoupancaMock.depositar(50);
        assertEquals(50, contaPoupancaMock.getSaldo(50));
    }

    @Test
    void teste_atualizar_conta_poupanca(){
        ContaPoupanca contaPoupancaMock = new ContaPoupanca();
        contaPoupancaMock.atualizaConta(50);
        assertEquals(50, contaPoupancaMock.getSaldo(50));
    }

    @Test
    void teste_saque_conta_pequena(){
        ContaPoupanca contaPoupancaMock = new ContaPoupanca();
        contaPoupancaMock.sacar(50);
        assertEquals(50, contaPoupancaMock.getSaldo(50));
    }

}