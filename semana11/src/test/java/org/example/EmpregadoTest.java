package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void quando_salarioBase_1000_e_imposto_10_porcento_calcularSalario_900() {
        Empregado empregadoMock = new Empregado();
        empregadoMock.setSalaraioBase(1000);
        empregadoMock.setImposto(0.1);
        Assertions.assertEquals(900, empregadoMock.calcularSalario());
    }
}