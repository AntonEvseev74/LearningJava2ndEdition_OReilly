package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson10;

/*
 * Так как в Java множественно наследование не поддерживается нам помогут -
 * Интерфейсы, используются скажем так для множественного наследования.
 * Мы можем имплементривоать (implements) Интерфейс в класс, тем самым расширим возможности класса
 */

public class Dog extends Canine implements Pet{

    // Поведение животного, когда оно должно издать звук
    @Override // Это ключевое слово обозначает, что метод переопределен - полиморфизм
    public void makeNoise(){
        System.out.println(getPicture() + ": Гав, Гав");
    }

    // Поведение животного при обнаружении своего предпочтительного источника пищи - мяса или травы
    @Override
    public void eat(){
        System.out.println(getPicture() + ": Я ем косточки и " + getFood());
    }

    @Override
    public void beFriendly() {
        System.out.println(getPicture() + ": Я дружелюбный! Но могу и укусить!");
    }

    @Override
    public void play() {
        System.out.println(getPicture() + ": Я играю! Бегаю за палкой!");
    }
}
