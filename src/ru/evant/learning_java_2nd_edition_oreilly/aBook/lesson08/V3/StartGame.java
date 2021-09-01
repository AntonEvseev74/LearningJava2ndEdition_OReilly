package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.V3;

public class StartGame {
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
