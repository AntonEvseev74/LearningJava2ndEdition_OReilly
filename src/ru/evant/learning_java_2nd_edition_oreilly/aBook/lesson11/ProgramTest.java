package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson11;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код к странице: 201
 */

/*
 * Конструктор класса
 */

public class ProgramTest {
    static int[] boundaries = {640, 480};

    public static void main(String[] args) {
        Cat cat = new Cat("КОТ", "Мясо", 10 , 640, 480, 100, 100);
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        cat.roam();
        cat.beFriendly();
        cat.play();

        Dog dog = new Dog("СОБАКА", "Мясо", 10 , boundaries, 200, 200);
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        dog.roam();
        dog.beFriendly();
        dog.play();

        Hippo hippo = new Hippo("ГИПОПОТАМ", "Мясо", 9 , boundaries, 300, 300);
        hippo.makeNoise();
        hippo.eat();
        hippo.sleep();
        hippo.roam();

        Lion lion = new Lion("ЛЕВ", "Мясо", 4 , boundaries, 400, 400);
        lion.makeNoise();
        lion.eat();
        lion.sleep();
        lion.roam();

        Tiger tiger = new Tiger("ТИГР", "Мясо", 5 , boundaries, 450, 450);
        tiger.makeNoise();
        tiger.eat();
        tiger.sleep();
        tiger.roam();

        Wolf wolf = new Wolf("ВОЛК", "Мясо", 5 , boundaries, 250, 250);
        wolf.makeNoise();
        wolf.eat();
        wolf.sleep();
        wolf.roam();
    }
}
