package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example1;

public class Surgeon extends Doctor{

    void treatPatient(){
        System.out.println("class Surgeon: Проводим операцию");
    }

    void makeIncision(){
        System.out.println("class Surgeon: Делаем надрез (ой!)");
    }
}
