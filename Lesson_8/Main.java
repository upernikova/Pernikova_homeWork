package Lesson_8;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1:");
        WordAnalyzer analyzer = new WordAnalyzer();
        analyzer.countWords();

        System.out.println("\nЗадание 2:");
        PhoneDirectory directory = new PhoneDirectory();
        directory.add("Ковалев", "+375 (29) 321-45-67");
        directory.add("Иванов", "+375 (29) 123-45-67");
        directory.add("Петров", "+375 (33) 234-56-78");
        directory.add("Зайцев", "+375 (25) 543-67-89");
        directory.add("Ковалев", "+375 (44) 654-78-90");
        directory.add("Романов", "+375 (33) 987-01-23");
        directory.add("Федоров", "+375 (33) 789-01-23");
        directory.add("Новиков", "+375 (33) 789-01-23");
        directory.add("Ковалев", "+375 (29) 321-45-67");

        directory.get("Ковалев");
        directory.get("Зайцев");
        directory.get("Иванов");
        directory.get("Федоров");
        directory.get("Новиков");
    }
}