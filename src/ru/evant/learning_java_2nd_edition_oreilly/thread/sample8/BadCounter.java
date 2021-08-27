package ru.evant.learning_java_2nd_edition_oreilly.thread.sample8;

public class BadCounter implements Counter{
    private volatile int x;

    @Override
    public void increment() {
        x++;
        /* проблема тут
         * тут происходит 3 операции: чтение, изменение(вычисление), запись
         * x = x + 1
         * x = читаем х  - чтение, пусть x будет 3
         * x = 3 + 1     - изменение, производим вычисление, получаем 4
         * x = 4         - запись, записываем результат вычисления в переменную x (присваиваем переменной x, результат вычисления)
         * неожиданный результат получается в следствии того, что
         * пока вы допустим читаете, кто-то может прийти изменить значение
         * Так получается потому что,
         * volatile обеспечивает блокировку доступа только к чтению и записи, к изменению не блокирует
         *
         * Решить проблему можно синхронизацией:
         * public synchronized void increment() { x++; }
         *
         * или реализовать инкремент через атомики (AtomicInteger.class) - Эта реализация в классе GoodCounter
        */
    }

    @Override
    public String toString(){
        return "BadCounter  = " + x;
    }
}
