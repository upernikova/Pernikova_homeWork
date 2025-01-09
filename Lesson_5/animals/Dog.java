package Lesson_5.animals;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    // Переопределение метода для бега
    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал: " + distance + " м");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м");
        }
    }

    // Переопределение метода для плавания
    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл: " + distance + " м");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}