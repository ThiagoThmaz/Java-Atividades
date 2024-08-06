package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class MainTest {

    @Test
    void teste_calcular_dias_de_diferenca() {
        LocalDate data1 = LocalDate.parse("2024-05-01");
        LocalDate data2 = LocalDate.parse("2024-05-08");
        Assertions.assertEquals(7,Main.calcularDiferenca(data1, data2));
    }
}