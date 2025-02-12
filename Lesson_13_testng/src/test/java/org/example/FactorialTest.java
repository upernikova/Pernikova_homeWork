package org.example;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.*;

public class FactorialTest {
    private FactorialCalculator f;

    @BeforeClass
    public void setUp() {
        f = new FactorialCalculator();
    }

    /*
      Тест проверяет корректность вычисления факториала для положительных чисел
     */
    @Test
    public void testFactorialCalculation() {
        assertEquals(f.calculateFactorial(1), 1);
        assertEquals(f.calculateFactorial(5), 120);
    }

    /*
      Тест для проверки отрицательных чисел
     */
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        f.calculateFactorial(-1);
    }

    /*
      Проверяем факториал 0
     */
    @Test
    public void testFactorialNull() {
        assertEquals(f.calculateFactorial(0), 1);
    }
}