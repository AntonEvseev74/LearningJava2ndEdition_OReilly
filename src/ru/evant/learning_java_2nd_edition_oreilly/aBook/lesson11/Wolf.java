package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson11;

/*
 * Конструкторы:
 * public Cat(){} - Конструктор по умолчанию, если не объявлен какой либо другой, то используется этот.
 * Если используется только он один, его можно не писать.
 * Конструкторов может быть множество
 * Если у вас объявлен конструктор, но вы хотите оставить возможность пользоваться конструктором по умолчанию,
 * вам придется написать его в коде.
 */

public class Wolf extends Canine {

    /* Конструкторы */
    public Wolf(){}

    public Wolf(String picture, String food, int hunger, int[] boundaries, int[] location){
        setPicture(picture);
        setFood(food);
        setHunger(hunger);
        setBoundaries(boundaries);
        setLocation(location);
    }

    public Wolf(String picture, String food, int hunger, int[] boundaries,  int locationX, int locationY){
        setPicture(picture);
        setFood(food);
        setHunger(hunger);
        setBoundaries(boundaries);
        setLocationX(locationX);
        setLocationY(locationY);
    }

    public Wolf(String picture, String food, int hunger, int boundariesWight, int boundariesHeight, int locationX, int locationY){
        setPicture(picture);
        setFood(food);
        setHunger(hunger);
        setBoundariesWight(boundariesWight);
        setBoundariesHeight(boundariesHeight);
        setLocationX(locationX);
        setLocationY(locationY);
    }

    /* Методы */
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
