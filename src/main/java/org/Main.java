package org;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        dog.run(150);
        dog.swim(5);

        Cat cat1 = new Cat("Мурка");
        cat1.run(150);
        cat1.swim(5);

        // Добавление еды в миску
        Cat.addFood(20);

        // Коты кушают из миски
        cat1.eat(15);

        // Проверка сытости кота
        System.out.println(cat1.isFull() ? cat1.getName() + " сыт!" : cat1.getName() + " голоден.");

        // Информация о количестве созданных животных
        System.out.println("Количество созданных животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
    }
}