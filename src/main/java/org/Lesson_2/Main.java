package org.Lesson_2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Голубой", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Сиреневый");

        displayShapeInfo(circle);
        displayShapeInfo(rectangle);
        displayShapeInfo(triangle);
    }

    private static void displayShapeInfo(Shape shape) {
        System.out.println("Фигура: " + shape.getClass().getSimpleName());
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет фона: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println("------------------------");
    }
}