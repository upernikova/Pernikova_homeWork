package Lesson_5.animals;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        this.isFull = false;
        catCount++;
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

    // Переопределение метода для плавания (коты не умеют плавать)
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    // Метод для кормления кота из миски
    public void eatFromBowl(Bowl bowl) {
        if (bowl.getFood() >= 10) {
            bowl.decreaseFood(10);
            isFull = true;
            System.out.println(name + " покушал");
        } else {
            System.out.println(name + " не хватает еды в миске");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}