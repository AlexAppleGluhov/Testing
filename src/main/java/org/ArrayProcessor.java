package org;

// Исключение для неверного размера массива
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Исключение для неверных данных в ячейках
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArrayProcessor {

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }

        int sum = 0;

        // Проход по элементам массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    // Преобразование строки в целое число
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Бросаем исключение с детализацией об ошибке
                    throw new MyArrayDataException(
                            "Ошибка в ячейке [" + i + "][" + j + "]: значение '" + array[i][j] + "' не является числом");
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "2", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = processArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}