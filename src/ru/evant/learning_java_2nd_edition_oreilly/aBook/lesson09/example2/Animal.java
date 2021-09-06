package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example2;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код к странице: 201
 */

/*
 * Наследование
 */

public class Animal {
    /* Переменные экзампляра: */
    String picture;                 // Имя JPEG-файла, который ассоциируется с данным животным
    String food;                    // Тип еды, которую это животное употребляет. Пока дапускается 2 значения: мясо и трава.
    int hunger;                     // Целое число, описывающее уровень аппетита животного. Зависит от того, сколько и когда ест животное.
    int[] boundaries = new int[2];  // Значение, описывающее длину и ширину участка (например 640х480), по которому животное будет бродить.
    int[] location = new int[2];    // Координаты X и Y, определяющие местоположение животного.

    /* Методы: */
    // Поведение животного, когда оно должно издать звук
    void makeNoise(){
        System.out.println(picture + ": Я издаю звук");
    }

    // Поведение животного при обнаружении своего предпочтительного источника пищи - мяса или травы
    void eat(){
        System.out.println(picture + ": Я ем " + food);
    }

    // Поведение животного когда оно решает поспать
    void sleep(){
        System.out.println(picture + ": Я сплю");
    }

    // Поведение животного, когда оно не ест и не спит (вероятно, просто скитается вокруг в ожидании столкновения с источником пищи или границами участка
    void road(){
        System.out.println(picture + ": Я гуляю. Сейчас я нахожусь тут (" + location[0] + ":" + location[1] + ")");
    }
}
