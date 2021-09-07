package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson10;

public class Hippo extends Animal {
    @Override // Это ключевое слово обозначает, что метод переопределен - полиморфизм
    public void makeNoise() {
        System.out.println(getPicture() + ": Я издаю звук");
    }

    @Override
    public void eat() {
        System.out.println(getPicture() + ": Я ем " + getFood());
    }

    @Override
    public void roam() {
        System.out.println(getPicture() + ": Я гуляю. Сейчас я нахожусь тут (" + getLocationX() + ":" + getLocationY() + ")");
    }
}
