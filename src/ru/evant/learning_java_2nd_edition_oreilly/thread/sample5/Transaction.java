package ru.evant.learning_java_2nd_edition_oreilly.thread.sample5;

public class Transaction extends Thread {
    private Account account;    // Аккаунт с которым происходит транзакция
    private int withdraw;       // Количество денег, которое нужно снять со счета

    public Transaction(Account account, int withdraw) {
        this.account = account;
        this.withdraw = withdraw;
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
        synchronized (account) {
            int total = account.getMoney();
            if (total >= withdraw) {
                account.setMoney(total - withdraw);
            }
        }
    }
}
