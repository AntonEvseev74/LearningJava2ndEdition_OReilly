package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example4;

public class Feline extends Animal {

    // Поведение животного, когда оно не ест и не спит (вероятно, просто скитается вокруг в ожидании столкновения с источником пищи или границами участка
    public void roam() {
        System.out.println(getPicture() + ": Я гуляю сам по себе. Сейчас я нахожусь тут (" + getLocationX() + ":" + getLocationY() + ")");
    }
}
