package ru.evant.learning_java_2nd_edition_oreilly.lesson05;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код со страниц: 68-70
 * Игра в угадывание
 */

/*
 * ООП
 * Классы:
 * GuessGame.class
 * Player.class
 * GameLauncher.class
 */

/*
 * Класс GameLauncher
 * это точка, из которой стартует приложение.
 * Он содержит метод main().
 * В методе main() создается объект GuessGame,
 * из которого вызывается метод startGame().
 */

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame(); // Создаем объект класса GuessGame, присваиваем ссылку на объект ссылочной переменной game типа GuessGame
        game.startGame(); // Вызываем метод startGame() для объекта game (для объекта на который ссылается переменная game)
    }
}
