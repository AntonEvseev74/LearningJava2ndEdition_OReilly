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
 * Класс MovieTestDrive создает объекты (экземпляры) класса Movie
 * и с помощью оператора (.)
 * присваивает определенные значения его переменным экземпляра.
 * Он так же вызывает методы этих объектов.
 */

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie movie1 = new Movie();                 // Создаем объект класса Movie, и присваем ссылку на него ссылочной переменной movie1 типа Movie
        movie1.title = "Как прогореть на Акциях";   // Присвоить значение полю title класса Movie, объекту на который ссылается ссылочная переменная movie1
        movie1.genre = "Трагедия";
        movie1.rating = -2;
        movie1.playIt();                            // Вызываем метод класса Movie, объекту на который ссылается ссылочная переменная movie1

        Movie movie2 = new Movie();
        movie2.title = "ПотерЯнные в офисе";
        movie2.genre = "Комедия";
        movie2.rating = 5;

        Movie movie3 = new Movie();
        movie3.title = "Байт-Клуб";
        movie3.genre = "Трагедия, но в целом веселая";
        movie3.rating = 127;
    }
}
