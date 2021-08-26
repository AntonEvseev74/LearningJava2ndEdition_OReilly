package ru.evant.learning_java_2nd_edition_oreilly.thread.sample1;

/* Многопоточность.
 * Потоки.
 * Создание потоков.
 */

// Создать поток. Первый способ. #1
class Test1 extends Thread {
    @Override
    public void run(){
        System.out.println("Привет! Я #1 - " + this.getClass().getName());
    }
}

// Создать поток. Второй способ. #2
class Test2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Привет! Я #2 - " + this.getClass().getName());
    }
}

public class Sample1 {
    public static void main(String[] args) {
        // #1
        Test1 thread1 = new Test1();                // Создать поток
        thread1.setDaemon(true);                    // если утсановить true в демона, тогда этот поток завершится сразу после завершения основного потока main().
        thread1.setPriority(Thread.MAX_PRIORITY);   // Устанавливает приоритет выполнения потока. принимает значения типа int от 1 до 10.
        thread1.start();                            // Запустить поток

        // #2
        Thread thread2 = new Thread(new Test2());
        thread2.start();

        // #3
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет! Я #3 - " + this.getClass().getName());
            }
        });
        thread3.start();

        // поток main
        System.out.println("Привет! Я основной поток. Метод main()." );
    }
}
