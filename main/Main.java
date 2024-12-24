package main;

public class Main {
    public static void main(String[] args) {

        Lesson_3 task = new Lesson_3();
        System.out.println("\n Task 1:");
        task.printThreeWords();

        System.out.println("\n Task 2:");
        task.checkSumSign();

        System.out.println("\n Task 3:");
        task.printColor();

        System.out.println("\n Task 4:");
        task.compareNumbers();

        System.out.println("\n Task 5:");
        System.out.println(task.chek(3,17));

        System.out.println("\n Task 6:");
        task.evaluator(-1);

        System.out.println("\n Task 7:");
        System.out.println(task.cheking(0));

        System.out.println("\n Task 8:");
        task.printing("Задание\n", 2);

        System.out.println("\n Task 9:");
        System.out.println(task.chek2(1900));

        System.out.println("\n Task 10:");
        task.change();

        System.out.println("\n Task 11:");
        task.fill();

        System.out.println("\n Task 12:");
        task.multiply();

        System.out.println("\n Task 13:");
        task.diagonal();

        System.out.println("\n Task 14:");
        task.array(5,25);
    }
}