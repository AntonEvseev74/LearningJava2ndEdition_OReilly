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
 *  версия 2
 */



import java.util.ArrayList;

public class SimpleDotComGameV2 {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelperV2 helper = new GameHelperV2();

        SimpleDotComV2 theDotCom = new SimpleDotComV2();
        int randomNum = (int) (Math.random() * 5);

        //int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        ArrayList<String> locations = new ArrayList<>();
        locations.add(randomNum + "");
        locations.add((randomNum+1) + "");
        locations.add((randomNum+2) + "");

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