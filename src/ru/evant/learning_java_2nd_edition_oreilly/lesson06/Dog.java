package ru.evant.learning_java_2nd_edition_oreilly.lesson06;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код со страниц: 92
 */

/*
 * ООП
 * Массивы
 */

public class Dog {

    String name;

    public static void main(String[] args) {
        // Создаём объект Dog и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        // Создаём массив типа Dog
        Dog[] myDogs = new Dog[3];
        // Поместить в массив несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // Получаем доступ к объектам Dog с помощью ссылок из массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джорж";

        // Выводим на экран какое имя у myDogs[2]
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        // Теперь переберем все элементы массива и вызовем для каждого метод bark()
        int x = 0;
        while (x < myDogs.length) { // Массивы содержат переменную length, которая пердоставляет количество хранимых элементов в массиве
            myDogs[x].bark();
            x++;
        }
    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }
    public void eat() {}
    public void chaseCat() {}
}
