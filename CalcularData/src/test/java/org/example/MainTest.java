package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void teste_calcular_dias_de_diferenca() {
        LocalDate data1 = LocalDate.parse("2024-05-01");
        LocalDate data2 = LocalDate.parse("2024-05-08");
        assertEquals(7,Main.calcularDiferenca(data1, data2));
    }
}