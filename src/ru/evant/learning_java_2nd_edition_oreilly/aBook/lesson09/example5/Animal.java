package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example5;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код к странице: 201
 */

/*
 * Абстрактный класс - ключевое слово abstract
 * Экземпляр этого класса создать нельзя
 */

public abstract class Animal {
    /* Переменные экзампляра: */
    private String picture;                 // Имя JPEG-файла, который ассоциируется с данным животным
    private String food;                    // Тип еды, которую это животное употребляет. Пока дапускается 2 значения: мясо и трава.
    private int hunger;                     // Целое число, описывающее уровень аппетита животного. Зависит от того, сколько и когда ест животное.
    private int[] boundaries = new int[2];  // Значение, описывающее длину и ширину участка (например 640х480), по которому животное будет бродить.
    private int[] location = new int[2];    // Координаты X и Y, определяющие местоположение животного.

    /* Методы: */
    // Поведение животного, когда оно должно издать звук
    public abstract void makeNoise();

    // Поведение животного при обнаружении своего предпочтительного источника пищи - мяса или травы
    public abstract void eat();

    // Поведение животного когда оно решает поспать
    public void sleep(){
        System.out.println(picture + ": Я сплю");
    }

    // Поведение животного, когда оно не ест и не спит (вероятно, просто скитается вокруг в ожидании столкновения с источником пищи или границами участка
    public abstract void roam();

    /* Методы: Геттеры и Сеттеры */
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int[] getBoundaries() {
        return boundaries;
    }

    public int getBoundariesWight() {
        return boundaries[0];
    }

    public int getBoundariesHeight() {
        return boundaries[1];
    }

    public void setBoundaries(int[] boundaries) {
        this.boundaries = boundaries;
    }

    public void setBoundariesWight(int boundaries) {
        this.boundaries[0] = boundaries;
    }

    public void setBoundariesHeight(int boundaries) {
        this.boundaries[1] = boundaries;
    }

    public int[] getLocation() {
        return location;
    }

    public int getLocationX() {
        return location[0];
    }

    public int getLocationY() {
        return location[1];
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public void setLocationX(int location) {
        this.location[0] = location;
    }

    public void setLocationY(int location) {
        this.location[1] = location;
    }
}
