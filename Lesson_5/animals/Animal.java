package Lesson_5.animals;

public abstract class Animal {
    public String name;
    protected int runLimit;
    protected int swimLimit;
    private static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}