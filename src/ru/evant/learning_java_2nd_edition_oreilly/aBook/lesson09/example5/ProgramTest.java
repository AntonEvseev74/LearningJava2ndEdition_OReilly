package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example5;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код к странице: 201
 */

/*
 * Наследование, Полиморфизм, Инкапсуляция
 * Animal, Canine и Feline - Абстрактные классы - Экземпляры этих классов создать НЕЛЬЗЯ
 */

public class ProgramTest {
    static int[] boundaries = {640, 480};

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setPicture("КОТ");
        cat.setFood("Мясо");
        cat.setHunger(10);
        cat.setBoundaries(boundaries);
        cat.setLocationX(100);
        cat.setLocationY(100);
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        cat.roam();

        Dog dog = new Dog();
        dog.setPicture("СОБАКА");
        dog.setFood("Мясо");
        dog.setHunger(5);
        dog.setBoundaries(boundaries);
        dog.setLocationX(200);
        dog.setLocationY(200);
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        dog.roam();

        Hippo hippo = new Hippo();
        hippo.setPicture("ГИПОПОТАМ");
        hippo.setFood("Траву");
        hippo.setHunger(8);
        hippo.setBoundaries(boundaries);
        hippo.setLocationX(300);
        hippo.setLocationY(300);
        hippo.makeNoise();
        hippo.eat();
        hippo.sleep();
        hippo.roam();

        Lion lion = new Lion();
        lion.setPicture("ЛЕВ");
        lion.setFood("Мясо");
        lion.setHunger(4);
        lion.setBoundaries(boundaries);
        lion.setLocationX(400);
        lion.setLocationY(400);
        lion.makeNoise();
        lion.eat();
        lion.sleep();
        lion.roam();

        Tiger tiger = new Tiger();
        tiger.setPicture("ТИГР");
        tiger.setFood("Мясо");
        tiger.setHunger(5);
        tiger.setBoundaries(boundaries);
        tiger.setLocationX(450);
        tiger.setLocationY(450);
        tiger.makeNoise();
        tiger.eat();
        tiger.sleep();
        tiger.roam();

        Wolf wolf = new Wolf();
        wolf.setPicture("ВОЛК");
        wolf.setFood("Мясо");
        wolf.setHunger(6);
        wolf.setBoundaries(boundaries);
        wolf.setLocationX(250);
        wolf.setLocationY(250);
        wolf.makeNoise();
        wolf.eat();
        wolf.sleep();
        wolf.roam();
    }
}
