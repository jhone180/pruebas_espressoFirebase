package com.example.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicacionTest {

    @Test
    public void multiplicacionTest() {

        int testResultado1 = 100;
        int testResultado2 = 2325;
        int testResultado3 = 10650000;

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicacion(20, 5);
        assertEquals(testResultado1, resultado);

        resultado = calculadora.multiplicacion(155, 15);
        assertEquals(testResultado2, resultado);

        resultado = calculadora.multiplicacion(12500, 852);
        assertEquals(testResultado3, resultado);

    }

}
