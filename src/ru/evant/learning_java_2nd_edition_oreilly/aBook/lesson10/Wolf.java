package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson10;

public class Wolf extends Canine {

    // Поведение животного, когда оно должно издать звук
    @Override // Это ключевое слово обозначает, что метод переопределен - полиморфизм
    public void makeNoise(){
        System.out.println(getPicture() + ": Вауф, Вауфф");
    }

    // Поведение животного при обнаружении своего предпочтительного источника пищи - мяса или травы
    @Override
    public void eat(){
        System.out.println(getPicture() + ": Я лесной хищник, я ем " + getFood());
    }
}
