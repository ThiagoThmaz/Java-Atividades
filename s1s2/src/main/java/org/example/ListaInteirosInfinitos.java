package org.example;

import java.util.Arrays;

public class ListaInteirosInfinitos {

    int[] numeros = new int[1];

    public void add(int num){
        int[] novoNumeros = Arrays.copyOf(numeros, numeros.length + 1);
        novoNumeros[novoNumeros.length - 1] = num;
        numeros = novoNumeros;
    }

    public void printAllNumeros(){
        for(int i = 0 ; i < numeros.length ; i++){
            System.out.println("["+i+"}=" + numeros[i]);
        }
    }
}
