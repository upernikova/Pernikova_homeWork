package org.example;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();

        try {
            int result = calculator.calculateFactorial(5);
            System.out.println("5! = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}