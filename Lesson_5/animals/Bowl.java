package Lesson_5.animals;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        food = Math.max(food - amount, 0);
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("Добавлено " + amount + " еды. Количество еды в миске: " + food);
    }
}