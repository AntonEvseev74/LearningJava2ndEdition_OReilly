package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson02;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код со страниц: 44
 */

/*
* Песенка про 99 бутылок пива
*/

public class BeerSong {

    public static void main(String[] args) {

        int beerNum = 99;
        String word = "бутылок (бутылки)";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "бутылка"; // в единственном числе - ОДНА бутылка.
            } // Конец if

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum --;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене.");
            } // Конец if-else
        } // Конец цикла while
    } // Конец метода main
} // Конец класса BeerSong
