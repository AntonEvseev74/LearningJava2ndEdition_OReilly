package ru.evant.learning_java_2nd_edition_oreilly.thread.sample5;

/* Многопоточность.
 * Потоки.
 * Синхронизация.
 */
// https://vk.com/bookmarks  Время на видео 40:00

public class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
