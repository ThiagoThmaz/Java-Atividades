package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testar_fibonnaci_termo1() {
        Assertions.assertEquals(0,Fibonacci.calcularFibonacci(0));
    }

    @Test
    void testar_fibonnaci_termo2(){
        Assertions.assertEquals(1,Fibonacci.calcularFibonacci(1));
    }

    @Test
    void testar_fibonnaci_termo3(){
        Assertions.assertEquals(1, Fibonacci.calcularFibonacci(2));
    }

    @Test
    void testar_fibonnaci_termo4(){
        Assertions.assertEquals(2, Fibonacci.calcularFibonacci(3));
    }

    @Test
    void testar_fibonnaci_termo5(){
        Assertions.assertEquals(3, Fibonacci.calcularFibonacci(5));
    }

    @Test
    void testar_fibonnaci_termo6(){
        Assertions.assertEquals(13, Fibonacci.calcularFibonacci(8));
    }

    @Test
    void testar_fibonnaci_termo7(){
        Assertions.assertEquals(34, Fibonacci.calcularFibonacci(21));
    }

}