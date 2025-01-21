package Lesson_8;

import java.util.*;

public class WordAnalyzer {
    public void countWords() {
        // Список строк, созданный из массива, включает все слова
        List<String> words = Arrays.asList("Лист", "Солнце", "Дерево", "Ветер", "Солнце",
                "Звезда", "Ветер", "Океан", "Гора", "Звезда", "Солнце", "Океан", "Дождь");

        // Отбираем уникальные слова
        Set<String> uniqueWords = new LinkedHashSet<>(words);
        System.out.println("\nСписок слов: " + words);
        System.out.println("Уникальные слова: " + uniqueWords);

        // Подсчитываем количество повторений каждого слова
        System.out.println("Количество повторений каждого слова:");
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(words, word));
        }
    }
}