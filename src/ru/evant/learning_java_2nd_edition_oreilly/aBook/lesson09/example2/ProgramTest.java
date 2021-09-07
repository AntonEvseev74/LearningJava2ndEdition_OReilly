package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example2;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код к странице: 201
 */

/*
 * Наследование
 */

public class ProgramTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
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

        Dog dog = new Dog();
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

        Hippo hippo = new Hippo();
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

        Lion lion = new Lion();
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

        Tiger tiger = new Tiger();
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

        Wolf wolf = new Wolf();
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
