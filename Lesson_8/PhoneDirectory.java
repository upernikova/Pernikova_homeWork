package Lesson_8;

import java.util.*;

public class PhoneDirectory {
    // Хранение телефонного справочника
    private final Map<String, List<String>> directory = new HashMap<>();

    // Метод для добавления номера телефона
    public void add(String name, String number) {
        directory.computeIfAbsent(name, k -> new ArrayList<>()).add(number);
    }

    // Метод для получения номеров по фамилии
    public void get(String name) {
        List<String> phones = directory.getOrDefault(name, Collections.emptyList());
        if (phones.isEmpty()) {
            System.out.println("\nПользователь с фамилией " + name + " не найден!");
        } else {
            System.out.println("\nФамилия: " + name + "\nНомер телефона: " + phones);
        }
    }
}