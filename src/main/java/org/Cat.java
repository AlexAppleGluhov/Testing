package org;

public class Cat extends Animal {
    private static int catCount = 0;
    private final String name; // Имя кота
    private boolean full;
    private static int foodBowl = 0;

    public Cat(String name) {
        super();
        this.name = name;
        this.full = false; // изначально кот голоден
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(int amount) {
        if (amount <= foodBowl) {
            foodBowl -= amount;
            full = true; // кот сыт
            System.out.println(name + " покушал " + amount + " еды.");
        } else {
            System.out.println(name + " не хватает еды в миске.");
        }
    }

    public static void addFood(int amount) {
        foodBowl += amount;
        System.out.println("В миску добавлено " + amount + " еды. Всего еды в миске: " + foodBowl);
    }

    public boolean isFull() {
        return full;
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getName() { // Геттер для имени
        return name;
    }
}
