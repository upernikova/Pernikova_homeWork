package Lesson_8;

import java.util.*;

public class PhoneDirectory {
    // Хранение телефонного справочника
    private final Map<String, Set<String>> directory = new HashMap<>();

    // Метод для добавления номера телефона
    public void add(String name, String number) {
        // Проверяем, не записан ли уже этот номер за другим человеком
        for (Map.Entry<String, Set<String>> entry : directory.entrySet()) {
            if (entry.getValue().contains(number)) {
                System.out.println("Ошибка: Номер " + number + " уже принадлежит пользователю с фамилией " + entry.getKey());
                return;
            }
        }
        // Добавляем номер в справочник
        directory.computeIfAbsent(name, k -> new HashSet<>()).add(number);
    }

    // Метод для получения номеров по фамилии
    public void get(String name) {
        Set<String> phones = directory.getOrDefault(name, Collections.emptySet());
        if (phones.isEmpty()) {
            System.out.println("\nПользователь с фамилией " + name + " не найден!");
        } else {
            System.out.println("\nФамилия: " + name + "\nНомер телефона: " + String.join(", ", phones));
        }
    }
}