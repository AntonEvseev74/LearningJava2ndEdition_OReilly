package ru.evant.learning_java_2nd_edition_oreilly.lesson07;

public class GoodDogTestDrive {
    public static void main(String[] args) {

        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Первая собака: " + one.getSize());
        System.out.println("Вторая собака: " + two.getSize());

        one.bark();
        two.bark();
    }
}
