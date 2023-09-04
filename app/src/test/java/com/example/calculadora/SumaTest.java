package com.example.calculadora;


import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest {

    @Test
    public void testSuma() {

        int testResultado1 = 650;
        int testResultado2 = 2005;
        int testResultado3 = 913700;

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.suma(150,500);
        assertEquals(testResultado1, resultado);

        resultado = calculadora.suma(1250, 755);
        assertEquals(testResultado2, resultado);

        resultado = calculadora.suma(758450, 155250);
        assertEquals(testResultado3, resultado);

    }

}
