package org;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        // Создаем массив слов с повторениями
        String[] wordsArray = {
                "Яблоко", "Банан", "Апельсин", "Яблоко", "Банан",
                "Киви", "Апельсин", "Грейпфрут", "Киви", "Банан",
                "Яблоко", "Персик", "Грейпфрут", "Киви", "Банан"
        };

        // Используем HashMap для подсчета частоты слов
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsArray) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова и их частоту
        System.out.println("Уникальные слова и их частота:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber);
    }

    // Метод для получения номеров по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Иванов", "79996661300");
        pb.add("Иванов", "79998881400");
        pb.add("Петров", "79997771500");
        pb.add("Сидоров", "79995551600");
        pb.add("Иванов", "79994441700");

        // Получаем номера по фамилии
        System.out.println("Номера телефонов для Иванов: " + pb.get("Иванов"));
        System.out.println("Номера телефонов для Петров: " + pb.get("Петров"));
        System.out.println("Номера телефонов для Сидоров: " + pb.get("Сидоров"));
        System.out.println("Номера телефонов для Смирнов: " + pb.get("Смирнов"));
    }
}