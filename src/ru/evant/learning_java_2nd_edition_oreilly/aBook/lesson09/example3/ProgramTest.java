package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example3;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код к странице: 201
 */

/*
 * Наследование, Полиморфизм
 */

public class ProgramTest {
    public static void main(String[] args) {
        Cat3 cat = new Cat3();
        cat.picture = "КОТ";
        cat.food = "Мясо";
        cat.hunger = 10;
        cat.boundaries[0] = 640;
        cat.boundaries[0] = 480;
        cat.location[0] = 120;
        cat.location[1] = 120;
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        cat.roam();

        Dog3 dog = new Dog3();
        dog.picture = "СОБАКА";
        dog.food = "Мясо";
        dog.hunger = 5;
        dog.boundaries[0] = 640;
        dog.boundaries[0] = 480;
        dog.location[0] = 200;
        dog.location[1] = 200;
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        dog.roam();

        Hippo3 hippo = new Hippo3();
        hippo.picture = "ГИПОПОТАМ";
        hippo.food = "Траву";
        hippo.hunger = 8;
        hippo.boundaries[0] = 640;
        hippo.boundaries[0] = 480;
        hippo.location[0] = 400;
        hippo.location[1] = 400;
        hippo.makeNoise();
        hippo.eat();
        hippo.sleep();
        hippo.roam();

        Lion3 lion = new Lion3();
        lion.picture = "ЛЕВ";
        lion.food = "Мясо";
        lion.hunger = 4;
        lion.boundaries[0] = 640;
        lion.boundaries[0] = 480;
        lion.location[0] = 280;
        lion.location[1] = 280;
        lion.makeNoise();
        lion.eat();
        lion.sleep();
        lion.roam();

        Tiger3 tiger = new Tiger3();
        tiger.picture = "ТИГР";
        tiger.food = "Мясо";
        tiger.hunger = 1;
        tiger.boundaries[0] = 640;
        tiger.boundaries[0] = 480;
        tiger.location[0] = 390;
        tiger.location[1] = 150;
        tiger.makeNoise();
        tiger.eat();
        tiger.sleep();
        tiger.roam();

        Wolf3 wolf = new Wolf3();
        wolf.picture = "ВОЛК";
        wolf.food = "Мясо";
        wolf.hunger = 8;
        wolf.boundaries[0] = 640;
        wolf.boundaries[0] = 480;
        wolf.location[0] = 600;
        wolf.location[1] = 320;
        wolf.makeNoise();
        wolf.eat();
        wolf.sleep();
        wolf.roam();
    }
}
