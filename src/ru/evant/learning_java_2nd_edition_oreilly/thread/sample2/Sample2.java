package ru.evant.learning_java_2nd_edition_oreilly.thread.sample2;

/* Многопоточность.
 * Потоки.
 * Синхронизация потоков.
 */

class TestThread2 extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("Начало потока - " + this.getClass().getName());
            Thread.sleep(3000); // Усыпить(прервать) поток на 3 сек (1000милисекунд = 1 секунда)
        } catch (InterruptedException e) {
            System.out.println("Поток прерван(Interrupted)");
        }
        System.out.println("Конец потока - " + this.getClass().getName());
    }
}

public class Sample2 {
    public static void main(String[] args) throws InterruptedException {
        TestThread2 thread = new TestThread2();
        thread.start();

        // если раскомментировать строку. метод join() даёт завершиться выполнению потока. После этого будет продолжено выполнение потока main
        //thread.join();

        System.out.println("Конец основного потока main()");
    }
}
