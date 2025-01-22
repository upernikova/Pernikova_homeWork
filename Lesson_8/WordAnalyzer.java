package Lesson_8;

import java.util.*;

public class WordAnalyzer {
    public void countWords() {
        // Создаём массив строк
        String[] wordsArray = {"Лист", "Солнце", "Дерево", "Ветер", "Солнце",
                "Звезда", "Ветер", "Океан", "Гора", "Звезда", "Солнце", "Океан", "Дождь"};

        // Преобразуем массив в список
        List<String> words = Arrays.asList(wordsArray);

        // Отбираем уникальные слова
        Set<String> uniqueWords = new LinkedHashSet<>(words);
        System.out.println("\nСписок уникальных слов: " + uniqueWords);

        // Подсчитываем количество повторений каждого слова
        System.out.println("Количество повторений каждого слова:");
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(words, word));
        }
    }
}