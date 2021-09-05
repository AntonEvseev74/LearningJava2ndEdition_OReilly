package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v3;

import java.util.ArrayList;

public class DotCom {
    // Переменные экземпляра класса DotCom
    private ArrayList<String> locationCells; // ArrayList с ячейками, описывающими местоположение
    private String name; // Имя "сайта"

    // Сеттер, который обновляет местоположение "сайта" (случайный адрес, предоставляемый методом placeDotCom() из класса GameHelper
    public void setLocationCells(ArrayList<String> locationCells){
        this.locationCells = locationCells;
    }

    // Сеттер, который устанавливает имя "сайта"
    public void setName(String name) {
        this.name = name;
    }

    public String checkYourSelf(String userInput) {
        String result = "Мимо";
        /*
         Метод indexOf() из ArrayList в действии!
         Если ход пользователя совпал с одним из элементов ArrayList,
         то метод indexOf() вернет его местоположение.
         Если нет, то indexOf() вернет -1.
         */
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index); // Применяем метод remove() из ArrayList для удаления элемента

            if (locationCells.isEmpty()) { // Используем метод isEmpty(), чтобы проверить, все ли адреса были разгаданы
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + this.name + "   :( "); // Сообщаем пользователю о потоплении "сайта"
            } else {
                result = "Попал";
            }
        }
        return result; // Возвращаем "Мимо", "Попал" или "Потопил"
    }
}
