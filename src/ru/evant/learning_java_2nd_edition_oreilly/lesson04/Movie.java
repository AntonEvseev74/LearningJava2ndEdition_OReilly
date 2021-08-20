package ru.evant.learning_java_2nd_edition_oreilly.lesson04;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код со страниц: 67
 */

/*
 * ООП
 * Класс Фильм
 */

public class Movie {
    /* Поля класса, или переменные экземпляра */
    String title;   // Название
    String genre;   // Жанр
    int rating;     // Рэйтинг

    /* Методы класса */
    void playIt() {
        System.out.println("Проигрывание фильма: " + title);
    }
}
