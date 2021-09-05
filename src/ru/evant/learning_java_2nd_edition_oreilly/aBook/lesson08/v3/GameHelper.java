package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v3;

/*
Это вспомогательны класс для игры.
Если не считать метода приема пользовательского ввода, то его главная задача состоит в создании ячеек с адресами объектов DotCom.
 */

/*
Примечание:
Чтобы заработать "дополнительные очки", можете попробовать раскомментировать строки с System.out.print(ln) в методе placeDotCom().
Это позволит убедиться в том, что метод работает!
На экране вы увидите выражения с координатами "сайтов", которые позволят вам схитрить при игре,
а так же помогут проверить работоспособность данного метода.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput (String promt){
        String inputLine = null;
        System.out.println(promt + "  ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e){
            System.out.println("IOExeption: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells = new ArrayList<>();
        String[] alphaCoords = new String[comSize]; // Хранит координаты типа f6
        String temp = null;                         // Временная строка для конкотенации
        int[] coords = new int[comSize];            // Координаты "сайта"
        int attempts = 0;                           // Текущий счетчик попыток
        boolean success = false;                    // Нашли подходящее местоположение?
        int location = 0;                           // Текущее начальное местоположение

        comCount++;                 // Энный "сайт" для размещения
        int incr = 1;               // Устанавливаем горизонтальный инкремент
        if ((comCount % 2) == 1) {  // Если не четный (размещаем вертикально)
            incr = gridLength;      // Устанавливаем вертикальный инкремент
        }

        while ( ! success & attempts++ < 200){              // Главный поисковый цикл (32)
            location = (int) (Math.random() * gridSize);    // Получаем случайную стартовую точку
            //System.out.println("пробуем " + location);
            int x = 0;                                      // Энная позиция в "сайте", который нужно разместить
            success = true;                                 // Предполагаем успешный исход
            while (success && x < comSize) {                // Ищем соседнюю неиспользованную ячейку
                if (grid[location] == 0) {                  // Если еще не используется
                    coords[x++] = location;                 // Сохраняем местоположение
                    location += incr;                       // Пробуем следующую соседнюю ячейку
                    if (location >= gridSize) {                     // Вышли за рамки- низ
                        success = false;                            // Неудача
                    }
                    if (x > 0 && (location % gridLength == 0)) {    // Вышли за рамки - правый край
                        success = false;                            // Неудача
                    }
                } else {                                            // Нашли уже использующееся местоположение
                    //System.out.println("используется " + location);
                    success = false;                                // Неудача
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;
        //System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;                            // Помечаем на главной сетке как - использованные
            row = (int) (coords[x] / gridLength);           // Получаем значение строки
            column = coords[x] % gridLength;                // Получаем числовое значение столбца
            temp = String.valueOf(alphabet.charAt(column)); // Преобразуем его в строковый символ

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            //System.out.println(" coord " + x + " = " + alphaCells.get(x - 1));
        }

        //System.out.println("\n");
        return  alphaCells;
    }
}
