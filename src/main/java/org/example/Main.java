package org.example;

public class Main {
    public static void main(String[] args) {
        printThreeWords(); //Задание 1

        checkSumSign(); //Задание 2

        printColor(); //Задание 3

        compareNumbers(); //Задание 4

        System.out.println(isSumInRange(5, 5)); //Задание 5

        checkNumber(0); //Задание 6

        System.out.println(isNegative(5)); //Задание 7

        printStringMultipleTimes("Hello, Aleksandr!", 3); //Задание 8

        System.out.println(isLeapYear(2020)); //Задание 9

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; //Задание 10

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println(); //Пробел между задниями =)

        int[] array1 = new int[100]; //Задание 11

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        for (int value : array1) {
            System.out.print(value + " ");
        }

        System.out.println();

        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //Здание 12

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 6) {
                array2[i] *= 2;
            }
        }
        for (int num : array2) {
            System.out.print(num + " ");
        }

        int n = 5; //Задание 13
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }

        for (int i = 0; i < n; i++) { //Задание 14
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int len = 5;
        int initialValue = 10;

        int[] array3 = createArray(len, initialValue);

        for (int value : array3) {
            System.out.print(value + " ");
        }
    }

    //Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание 2
    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //Задание 3
        public static void printColor() {
            int value = 75;

            if (value < 0) {
                System.out.println("Красный");
            } else if (value >= 0 && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
    //Задание 4
    public static void compareNumbers() {
        int a = 3;
        int b = 5;

        if (a >= b) {
            System.out.println("A >= B");
        } else {
            System.out.println("A < B");
        }
    }
    //Задание 5
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    //Задание 6
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " является положительным.");
        } else {
            System.out.println("Число " + number + " является отрицательным.");
        }
    }
    //Задание 7
    public static boolean isNegative(int number) {
        return number < 0;
    }
    //Задание 8
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
    //Задание 9
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; // Год високосный
                }
                return false; // Год не високосный
            }
            return true; // Год високосный
        }
        return false; // Год не високосный
    }

    public static int[] createArray(int len, int initialValue) { //Задание 14
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}