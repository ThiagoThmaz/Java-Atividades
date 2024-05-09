package org.example;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data: ");
        String usuarioInforma = scanner.nextLine();

        LocalDate usuarioData = LocalDate.parse(usuarioInforma);

        LocalDate dataAtual = LocalDate.now();

        long diasDiferenca = calcularDiferenca(usuarioData, dataAtual);

        System.out.println("O intervalo e de " + diasDiferenca + " de diferença, e a data atual é " + dataAtual);
    }

    public static long calcularDiferenca(LocalDate data1, LocalDate data2){
        return ChronoUnit.DAYS.between(data1, data2);
    }

}
