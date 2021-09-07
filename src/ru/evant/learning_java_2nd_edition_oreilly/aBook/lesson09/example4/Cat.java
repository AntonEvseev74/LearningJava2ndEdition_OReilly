package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example4;

public class Cat extends Feline {

    // Поведение животного, когда оно должно издать звук
    public void makeNoise(){
        System.out.println(getPicture() + ": Мяу, Мяу");
    }

    // Поведение животного при обнаружении своего предпочтительного источника пищи - мяса или травы
    public void eat(){
        System.out.println(getPicture() + ": Я ловлю мышей, потомучто ем " + getFood());
    }
}
