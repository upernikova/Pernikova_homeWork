package Lesson_5.geometry;

public class Rectangle implements Shape {
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;

    // Конструктор для инициализации круга с указанными параметрами
    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Рассчитываем периметр, площадь, цвет фона, цвет границ
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
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
        return "Прямоугольник";
    }
}