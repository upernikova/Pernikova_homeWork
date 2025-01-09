package Lesson_5.geometry;

public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    // Конструктор для инициализации круга с указанными параметрами
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Рассчитываем периметр, площадь, цвет фона, цвет границ
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getName() {
        return "Круг";
    }
}