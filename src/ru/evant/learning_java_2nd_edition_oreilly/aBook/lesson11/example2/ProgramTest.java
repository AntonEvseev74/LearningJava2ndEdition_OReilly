package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson11.example2;

public class ProgramTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Василий");
        Person person3 = new Person("Николай", 25);
        Person person4 = new Person("Сергей", -8);

        System.out.println("Имя:");
        printName(person1);
        printName(person2);
        printName(person3);
        printName(person4);

        System.out.println();

        System.out.println("Данные:");
        printPerson(person1);
        printPerson(person2);
        printPerson(person3);
        printPerson(person4);
    }

    static void printName(Person person){
        System.out.println(person.getName());
    }

    static void printPerson(Person person){
        System.out.println("Меня зовут " + person.getName() + "! Мне " + person.getAge() + "л.");
    }
}
