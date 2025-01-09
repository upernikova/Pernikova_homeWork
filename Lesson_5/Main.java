package Lesson_5;

import Lesson_5.animals.Animal;
import Lesson_5.animals.Cat;
import Lesson_5.animals.Dog;
import Lesson_5.animals.Bowl;
import Lesson_5.geometry.Circle;
import Lesson_5.geometry.Rectangle;
import Lesson_5.geometry.Triangle;
import Lesson_5.geometry.Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Task 1:");
        // Создаем животных (2 кота и 1 собаку)
        Cat cat1 = new Cat("Коржик");
        Cat cat2 = new Cat("Компот");
        Dog dog1 = new Dog("Валет");

        cat1.run(150);
        cat1.swim(10);
        cat2.run(250);
        dog1.run(500);
        dog1.swim(5);

        Bowl bowl = new Bowl(11);
        Cat[] cats = {cat1, cat2};
        for (Cat cat : cats) {
            cat.eatFromBowl(bowl);
            System.out.println(cat.name + " - сытость: " + cat.isFull());
        }
        bowl.addFood(5);

        System.out.println("Сумма котов: " + Cat.getCatCount());
        System.out.println("Сумма собак: " + Dog.getDogCount());
        System.out.println("Сумма животных: " + Animal.getAnimalCount());

        System.out.println("\n Task 2:");
        // Создание фигур
        Shape circle = new Circle(10, "Красный", "Черный");
        Shape rectangle = new Rectangle(5, 7, "Синий", "Белый");
        Shape triangle = new Triangle(3, 5, 7, "Желтый", "Зеленый");

        circle.printInfo();
        System.out.println();
        rectangle.printInfo();
        System.out.println();
        triangle.printInfo();
    }
}