package org.Lesson_2;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();
    // Дефолтный метод для расчета периметра(если применимо)
    default double defaultPerimeter() {
        return 0;
    }
    // Методы для получения цвета
    String getFillColor();
    String getBorderColor();
}
