package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FactorialTest {
    private FactorialCalculator math;

    @BeforeEach
    void setUp() {
        math = new FactorialCalculator();
    }

    /*
      Тест проверяет корректность вычисления факториала для положительных чисел
     */
    @Test
    void testFactorialCalculation() {
        assertEquals(1, math.calculateFactorial(1));
        assertEquals(120, math.calculateFactorial(5));
    }

    /*
      Тест для проверки отрицательных чисел
     */
    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            math.calculateFactorial(-1);
        });
    }

    /*
      Проверяем факториал 0
     */
    @Test
    void testFactorialNull() {
        assertEquals(1, math.calculateFactorial(0));
    }
}