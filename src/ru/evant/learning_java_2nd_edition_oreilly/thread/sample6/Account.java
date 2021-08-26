package ru.evant.learning_java_2nd_edition_oreilly.thread.sample6;

/* Многопоточность.
 * Потоки.
 * Синхронизация.
 */
// https://vk.com/bookmarks  Время на видео 50:00

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

    // Следующие два метода работают одинаково. Выполняют одну и ту же задачу. Можно использовать любой
    public synchronized void withdraw (int amount) {
        if (money >= amount) money -= amount;
    }

    public void withdraw2 (int amount) {
        synchronized (this){
            if (money >= amount) money -= amount;
        }
    }
}
