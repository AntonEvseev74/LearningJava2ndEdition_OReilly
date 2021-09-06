package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example3;

public class Canine3 extends Animal3{

    // Поведение животного, когда оно не ест и не спит (вероятно, просто скитается вокруг в ожидании столкновения с источником пищи или границами участка
    void roam() {
        System.out.println(picture + ": Я гуляю в стае. Сейчас я нахожусь тут (" + location[0] + ":" + location[1] + ")");
    }
}
