package main;

public class Lesson_3 {

    /*
     1. Метод печатает в столбец три слова: Orange, Banana, Apple
     */
    public void printThreeWords() {
        System.out.print("Orange\n" + "Banana\n" + "Apple\n");
    }

    /*
    2. Метод суммирует переменные a и b, если их сумма больше или равна 0, то вывести в консоль
    сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”
     */
    public void checkSumSign() {
        int a = 5;
        int b = -25;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else{
            System.out.println("Сумма отрицательная");
        }
    }

    /*
    3. Если value меньше 0 (0 включительно), то в консоль метод выводит сообщение “Красный”,
    если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
    если больше 100 (100 исключительно) - “Зеленый”
     */
    public void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    /*
    4. Если a больше или равно b, то вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
     */
    public void compareNumbers() {
        int a = 5;
        int b = 25;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /*
    5. Метод проверяет, что сумма двух целых чисел лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false
     */
    public boolean chek(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /*
     6. Метод печатает в консоль, положительное ли число передали или отрицательное.
     Замечание: ноль считаем положительным числом!
     */
    public void evaluator(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    /*
    7. Метод возвращает true, если число отрицательное, и false если положительное.
    Замечание: ноль считаем положительным числом!
     */
    public boolean cheking(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    /*
    8. Метод выводит в консоль указанную строку, указанное количество раз
     */
    public void printing(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
    }

    /*
     9. Метод определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
     */
    public boolean chek2(int a) {
        return (a % 400 == 0) || (a % 100 != 0 && a % 4 == 0);
    }

    /*
     10. Целочисленный массив, состоящий из элементов 0 и 1.
     Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public void change() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
    11. Пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    public void fill() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
     12. Массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом,
     и числа меньшие 6 умножить на 2
     */
    public void multiply() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            } else {
                array[i] = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
    13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     */
    public void diagonal() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, k = array[i].length - 1; j < array[i].length; j++, k--) {
                if (i == j || k == i) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    /*
    14. Метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
     */
    public void array(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
    }
}