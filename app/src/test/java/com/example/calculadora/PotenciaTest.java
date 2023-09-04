package com.example.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class PotenciaTest {

    @Test
    public void testPotencia() {

        Calculadora calculadora = new Calculadora();

        int testResultado1 = 25;
        int testResultado2 = 759375;
        int testResultado3 = 1073741824;

        int resultado = calculadora.potencia(5, 2);
        assertEquals(testResultado1, resultado);

        resultado = calculadora.potencia(15, 5);
        assertEquals(testResultado2, resultado);

        resultado = calculadora.potencia(8, 10);
        assertEquals(testResultado3, resultado);

    }

}
