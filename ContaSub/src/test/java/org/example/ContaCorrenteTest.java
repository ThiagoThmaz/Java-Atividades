package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContaCorrenteTest {
    @Test
    void teste_depositar_conta_corrente() {
        ContaCorrente contaCorrenteMock = new ContaCorrente();
        contaCorrenteMock.depositar(50);
        Assertions.assertEquals(50, contaCorrenteMock.getSaldo(50));

    }

    @Test
    void teste_atualizar_conta_corrente(){
        ContaCorrente contaCorrenteMock = new ContaCorrente();
        contaCorrenteMock.atualizaConta(50);
        Assertions.assertEquals(50, contaCorrenteMock.getSaldo(50));
    }

    @Test
    void teste_saque_conta_corrente(){
        ContaCorrente contaCorrenteMock = new ContaCorrente();
        contaCorrenteMock.sacar(50);
        Assertions.assertEquals(50, contaCorrenteMock.getSaldo(50));
    }

    @Test
    void buscar_saldo_conta_corrente(){
        ContaCorrente contaCorrenteMock = new ContaCorrente();
        contaCorrenteMock.getSaldo(50);
        Assertions.assertEquals(50, contaCorrenteMock.getSaldo(50));
    }
}