package Lesson_6.exceptions;

// Исключение для обработки ошибок данных массива
public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int column, String value) {
        super(String.format("Введены неверные данные в ячейке [%d]х[%d]: '%s'", row + 1, column + 1, value));
    }
}