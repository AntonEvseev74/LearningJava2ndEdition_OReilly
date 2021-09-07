package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example5;

public class Cat extends Feline {

    // Поведение животного, когда оно должно издать звук
    @Override // Это ключевое слово обозначает, что метод переопределен - полиморфизм
    public void makeNoise(){
        System.out.println(getPicture() + ": Мяу, Мяу");
    }

    // Поведение животного при обнаружении своего предпочтительного источника пищи - мяса или травы
    @Override
    public void eat(){
        System.out.println(getPicture() + ": Я ловлю мышей, потомучто ем " + getFood());
    }
}
