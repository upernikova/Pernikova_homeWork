package Lesson_6;

import Lesson_6.exceptions.MyArraySizeException;
import Lesson_6.exceptions.MyArrayDataException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray arrayProcessor = new MyArray();

        String[][] arrays = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "!", "16"}
        };

        System.out.println("Переданный массив:");
        for (String[] row : arrays) {
            System.out.println(Arrays.toString(row));
        }

        try {
            int sum = arrayProcessor.initialisationArray(arrays);
            System.out.println("\nСумма чисел массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("\nВведен неверный размер массива!");
        } catch (MyArrayDataException e) {
            System.out.println("\nОшибка: " + e.getMessage());
        }
    }
}