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
 * Класс GuessGame
 * содержит три переменных для трёх объектов Player.
 * В методе startGame() объекта GuessGame происходит весь игровой процесс.
 * Он создает трёх игроков, затем "придумывает" случайные числа,
 * которые игроки должны угадывать.
 * После того, как каждого игрока просят угадать число, проверяет результат.
 * И либо выводится информация о победителях,
 * либо игроков просят угадать число еще раз.
 */

public class GuessGame {
    // Создаем три переменных экземпляра для трёх объектов Player
    Player player1;
    Player player2;
    Player player3;

    public void startGame() {
        // Создаем три объекта Player и присваиваем их трем переменным экземпляра (трём ссылочным переменным)
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        // Объявляем три переменные для хранения вариантов ответа от каждого игрока
        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;

        // Объявляем три переменные для хранения правильности или неправильности (true или false) ответов игроков
        boolean player1isRight = false;
        boolean player2isRight = false;
        boolean player3isRight = false;

        // Создаем число, которое игроки должны угадать
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9.");

        // Создаем главный цикл игры
        while (true) {
            System.out.println("Загаданное число: " + targetNumber);

            // Вызываем методы guess из каждого объекта Player.
            player1.guess();
            player2.guess();
            player3.guess();

            // Извлекаем варианты каждого игрока (результаты их методов guess()),
            // получая доступ к их переменным number
            guessPlayer1 = player1.number;
            System.out.println("Первый игрок думает, что это - " + guessPlayer1);
            guessPlayer2 = player2.number;
            System.out.println("Первый игрок думает, что это - " + guessPlayer2);
            guessPlayer3 = player3.number;
            System.out.println("Первый игрок думает, что это - " + guessPlayer3);

            // Проверяем варианты каждого из игроков на соответствие загаданному числу.
            // Если игрок угадал, то присваиваем соответствующей переменной значение true
            // (помните, что по умолчанию она хранит значение false)
            if (guessPlayer1 == targetNumber) player1isRight = true;
            if (guessPlayer2 == targetNumber) player2isRight = true;
            if (guessPlayer3 == targetNumber) player3isRight = true;

            if (player1isRight || player2isRight || player3isRight) { // если хоть один из игроков угадал (хоть одна переменная содержит - true)
                // выводим данные на экран
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + player1isRight);
                System.out.println("Второй игрок угадал? " + player2isRight);
                System.out.println("Третий игрок угадал? " + player3isRight);
                System.out.println("Конец игры.");

                // Игра окончена, так что прерываем цикл
                break;
            } else { // Иначе остаёмся в цикле и просим игроков сделать еще одну попытку
                // Мы должны продолжать, так как никто не угадал!
                System.out.println("Игроки должны попробовать еще раз.");
            } // Конец if/else
        } // Конец цикла
    } // Конец метода
} // Конец класса
