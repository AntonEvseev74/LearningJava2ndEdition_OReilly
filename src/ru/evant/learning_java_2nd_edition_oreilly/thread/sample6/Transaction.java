package ru.evant.learning_java_2nd_edition_oreilly.thread.sample6;

public class Transaction extends Thread {
    Account account;    // Аккаунт с которым происходит транзакция
    private int amount;       // Количество денег, которое нужно снять со счета

    public Transaction(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(System.currentTimeMillis() % 500); // случайная задержка
        } catch (InterruptedException e) {
            return;
        }

        // synchronized - принимает ссылку на объект, блокирует объект для работы с потоками.
        // Все потоки обращающиеся к объекту, работают с объектом по очереди.
        // Работает только с объектами. В блоке пишем код который работает с переданным объектом.
        /* Этот блок кода больше не нужен:
        synchronized (account) {
            int total = account.getMoney();
            if (total >= withdraw) {
                account.setMoney(total - withdraw);
            }
         */
        // Теперь мы можем использовать метод объекта
        account.withdraw(amount);
    }

}
