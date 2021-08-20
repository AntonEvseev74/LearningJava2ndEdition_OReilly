package ru.evant.learning_java_2nd_edition_oreilly.task;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код со страниц: 50
 */

/*
 * Упражнение
 * Магнитики с кодом
 */

public class Shuffle1 {
    public static void main(String[] args) {
         int x = 3;

         while (x > 0) {

             if (x > 2) {
                 System.out.print("a");
             }

             x = x - 1;
             System.out.print("-");

             if (x == 2) {
                 System.out.print("b c");
             }

             if (x == 1) {
                 System.out.print("d");
                 x = x -1;
             }
         }
    }
}
