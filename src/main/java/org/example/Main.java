package org.example;

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Person(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position + ", Email: " + email +
                ", Phone: " + phone + ", Salary: " + salary + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Manager", "pepet@mailbox.com", "892312313", 50000, 40);
        persArray[2] = new Person("Sidorov Sidor", "Designer", "sisd@mailbox.com", "892312314", 35000, 28);
        persArray[3] = new Person("Vasilev Vasiliy", "Developer", "vasiliy@mailbox.com", "892312315", 40000, 25);
        persArray[4] = new Person("Kovalev Alexey", "Analyst", "kovalex@mailbox.com", "892312316", 45000, 35);

        for (Person person : persArray) {
            System.out.println(person);
        }
    }
}
