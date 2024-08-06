package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[4];

        vetor[0] = 3;
        vetor[1] = 4;
        vetor[2] = 5;
        vetor[3] = 6;

        int [] novoVetor = {2024, 2023, 2025, 2030};
        System.out.println(novoVetor[0]);

        novoVetor[0] = 2032;
        System.out.println(novoVetor[0]);

        System.out.println(novoVetor.length);

        // Lop tradicional
        // for(start; condicao pra se manter : incremento)

        for(int i = 0; i < novoVetor.length; i++ ){
            System.out.println(novoVetor[1]);
        }

        //Lop aprimorado
        //for(tipo nomeVariavel : array)
        for(int ano : novoVetor){
            System.out.println(ano);
        }

        //While
        int i = 0;
        while (i != novoVetor.length){
            System.out.println(novoVetor[1]);
            i++;
        }

        // array inicial
        String[] alunos = new String[3];
        alunos[0] = "João";
        alunos[1] = "Maria";
        alunos[2] = "Pedro";

        //aumentar o array
        String[] novaListaAlunos = new String[4];
        novaListaAlunos[0] = alunos[0];
        novaListaAlunos[1] = alunos[1];
        novaListaAlunos[2] = alunos[2];
        novaListaAlunos[3] = "Joaquim";

        System.out.println("Lista: NovaListaAlunos");
        for(String nomeAluno : novaListaAlunos){
            System.out.println(nomeAluno);
        }

        String[] novaListaAlunosAgil = Arrays.copyOf(alunos, alunos.length + 1);
        novaListaAlunosAgil[3] = "Tiago";

        System.out.println();
        System.out.println("Lista: novaListaAlunosAgil");
        for(String nomeAluno : novaListaAlunosAgil){
            System.out.println(nomeAluno);
        }

        int[] numeroInteiros = {4,2,1,7};

        int[] copiaNumerosInteiros = numeroInteiros;

        numeroInteiros[0] = 1;

        for (int num : copiaNumerosInteiros){
            System.out.println(num);
        }

        int[] copiaProfundNumerosInteirs = Arrays.copyOf(numeroInteiros, numeroInteiros.length);

        ListaInteirosInfinitos lista = new ListaInteirosInfinitos();

        lista.add(4);
        lista.add(5);

        lista.printAllNumeros();

        int[] numerosInteirosDesordenados = {4,2,1,7};

        for (int num : numerosInteirosDesordenados){
            System.out.println(num);
        }

        Arrays.sort(numerosInteirosDesordenados);

        System.out.println();
        for (int num : numerosInteirosDesordenados){
            System.out.println();
        }

        int[] numeros = new int[10];
        for (int num : numeros){
            System.out.println(num);
        }
    }
}