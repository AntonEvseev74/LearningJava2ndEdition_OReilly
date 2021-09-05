package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v3;

public class StartGame {
    public static void main(String[] args) {
        DotComBust game = new DotComBust(); // Создаем игровой объект
        game.setUpGame(); //Говорим игровому объекту подготовить игру
        // Говорим игровому объекту начать главный игровой цикл (продолжаем запрашивать пользовательский ввод и проверять полученные данные).
        game.startPlaying();
    }
}
