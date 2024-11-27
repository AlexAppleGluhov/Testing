package org.example;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }


    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attraction(name, workingHours, price));
    }


    public void displayAttractions() {
        System.out.println("Аттракционы в парке \"" + name + "\":");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double price;


        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + name + ", Время работы: " + workingHours + ", Стоимость: " + price + " руб.";
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Экстрим Лэнд");
        park.addAttraction("Американские горки", "10:00 - 18:00", 500);
        park.addAttraction("Колесо обозрения", "11:00 - 21:00", 300);
        park.addAttraction("Покер 3D", "09:00 - 19:00", 450);

        park.displayAttractions();
    }
}
