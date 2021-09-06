package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example3;

public class Feline3 extends Animal3{

    // Поведение животного, когда оно не ест и не спит (вероятно, просто скитается вокруг в ожидании столкновения с источником пищи или границами участка
    void roam() {
        System.out.println(picture + ": Я гуляю сам по себе. Сейчас я нахожусь тут (" + location[0] + ":" + location[1] + ")");
    }
}
