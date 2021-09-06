package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example3;

public class Lion3 extends Feline3 {

    // Поведение животного, когда оно должно издать звук
    void makeNoise(){
        System.out.println(picture + ": Ррр, Ррр");
    }

    // Поведение животного при обнаружении своего предпочтительного источника пищи - мяса или травы
    void eat(){
        System.out.println(picture + ": Я хищник, поэтому ем " + food);
    }
}
