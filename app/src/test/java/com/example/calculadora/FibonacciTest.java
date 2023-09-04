package com.example.calculadora;

import android.support.v4.os.IResultReceiver;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacciTest() {

        int testResultado1 = 5;
        int testResultado2 = 75025;
        int testResultado3 = 610;

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.fibonacci(5);
        assertEquals(testResultado1, resultado);

        resultado = calculadora.fibonacci(25);
        assertEquals(testResultado2, resultado);

        resultado = calculadora.fibonacci(15);
        assertEquals(testResultado3, resultado);

    }

}
