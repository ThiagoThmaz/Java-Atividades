package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContaCorrenteTest {

    @Test
    void teste_depositar_conta_corrente() {
        ContaCorrente contaCorrenteMock = new ContaCorrente();
        contaCorrenteMock.depositar(100);
//        Assertions.assertEquals(99.90, contaCorrenteMock.getSaldo(0.01));

    }

    @Test
    void teste_atualizar_conta_corrente(){
        ContaCorrente contaCorrenteMock = new ContaCorrente();
        contaCorrenteMock.atualizaConta(1);
    }



}