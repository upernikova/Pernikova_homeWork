package Lesson_5.geometry;

public class Triangle implements Shape {
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    // Конструктор для инициализации круга с указанными параметрами
    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Рассчитываем периметр, площадь, цвет фона, цвет границ
    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
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
        return "Треугольник";
    }
}