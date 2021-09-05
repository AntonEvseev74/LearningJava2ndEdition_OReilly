package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v3;

import java.util.ArrayList;

public class DotComBust {

    // Объявляем и инициализируем переменные, кторые нам понадобятся
    private final GameHelper helper = new GameHelper();
    private final ArrayList<DotCom> dotComList = new ArrayList<>(); // Создайте ArrayList только для объектов DotCom
    private int numOfGuesses = 0; // Количество попыток, которые сделал пользователь

    public void setUpGame(){
        // Создадим несколько "сайтов" и присвоим им адреса
        // Создаем три объекта DotCom даем им имена
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        // Помещаем три объекта DotCom в ArrayList
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        // Выводим краткие инструкции для пользователя
        System.out.println("Ваша цель - потопить три \"сайта\".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComList) { // Повторяем с каждым объектом DotCom в списке
            // Запрашиваем у вспомогательного объекта адрес "сайта"
            ArrayList<String> newLocation = helper.placeDotCom(3);
            // Вызываем сеттер из объекта DotCom, чтобы передать ему местоположение, которое только что получили от вспомогательного объекта.
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying(){
        while ( ! dotComList.isEmpty()){ // До тех пор, пока список объектов DotCom не станет пустым
            // Получаем пользовательский ввод
            String userGuess = helper.getUserInput("Сделайте ход");
            // Вызываем метод проверки хода пользователя - checkUserGuess()
            checkUserGuess(userGuess);
        }
        // Вызываем метод, конец игры - finishGame()
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        // Инкрементируем количество попыток, которые сделал пользователь
        numOfGuesses++;
        // Подразумеваем промах, пока не выяснили обратного
        String result = "Мимо";

        for (DotCom dotComToTest : dotComList) { // Повторяем это для все объектов DotCom в списке
            // Просим DotCom проверить ход пользователя, ищем попадание (или потопление)
            result = dotComToTest.checkYourSelf(userGuess);
            if (result.equals("Попал")) break; // Выходим из цикла, если есть попадание
            if (result.equals("Потопил")) {
                dotComList.remove(dotComToTest); // Ему пришел конец, так что удаляем его из списка
                break; // Выходим из цикла
            }
        }

        System.out.println(result); // Выводим для пользователя результат
    }

    private void finishGame(){
        // Выводим сообщение о том, как пользователь прошел игру
        System.out.println("Все \"сайты\" ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + "попыток");
            System.out.println("Вы не успели выбраться до того, как ваши вложения утонули.");
        } else {
            System.out.println("Это заняло у ас довольно много времени. " + numOfGuesses + "попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }
}
