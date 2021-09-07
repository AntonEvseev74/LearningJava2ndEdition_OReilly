package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson11.example2;

public class Person {
    // Переменные экземпляра
    private String name;
    private int age;

    // Конструкторы
    public Person() {
    }

    public Person(String personName) {
        name = personName;
    }

    public Person(String name, int age) {
        this.name = name;

        // так как возраст не может иметь отрицательное значение
        // делаем проверку
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    /* Методы */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // так как возраст не может иметь отрицательное значение
        // делаем проверку
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
}
