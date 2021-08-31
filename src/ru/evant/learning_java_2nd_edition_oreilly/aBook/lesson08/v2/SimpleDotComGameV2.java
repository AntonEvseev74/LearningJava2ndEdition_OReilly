package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v2;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код со страниц: 155-169
 */

/*
 * Аналог игры "Морской бой" - "Потопи сайт"
 *  версия 1
 */

import ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v1.GameHelperV1;
import ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v1.SimpleDotComV1;

public class SimpleDotComGameV2 {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelperV1 helper = new GameHelperV1();

        SimpleDotComV1 theDotCom = new SimpleDotComV1();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            } else {
                System.out.println(result);
            }
        }
    }
}
