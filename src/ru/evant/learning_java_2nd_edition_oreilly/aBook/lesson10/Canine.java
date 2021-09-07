package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson10;

/*
 * Абстрактный класс - ключевое слово abstract
 * Экземпляр этого класса создать нельзя
 */

public abstract class Canine extends Animal {

    @Override
    public abstract void makeNoise();

    @Override
    public abstract void eat();

    // Поведение животного, когда оно не ест и не спит (вероятно, просто скитается вокруг в ожидании столкновения с источником пищи или границами участка
    @Override
    public void roam() {
        System.out.println(getPicture() + ": Я гуляю в стае. Сейчас я нахожусь тут (" + getLocationX() + ":" + getLocationY() + ")");
    }
}
