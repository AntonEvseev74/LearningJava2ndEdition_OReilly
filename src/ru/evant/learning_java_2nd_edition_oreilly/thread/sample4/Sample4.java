package ru.evant.learning_java_2nd_edition_oreilly.thread.sample4;

/* Многопоточность.
 * Потоки.
 * Синхронизация.
 *
 * ключевое слово volatile.
 * volatile - гарантирует, что потоки не будут копировать поля потока, потоки будут работать с оригиналом
 * если поле отмечено ключевым словом volatile, алгоритм потоков таков:
 * 1й поток обратился к полю либо для чтения, либо для записи, поле блокируется для других потоков, пока 1й поток не закончит свою операцию,
 * остальные потоки ждут пока 1й поток не закончит работу с полем
 * Т.е. все потоки работает с этим полем не одновременно, а поочереди.
 */

/*
 * Данный код по сути ручная реализация механизма
 * interrupt()/isInterrupted()
 * из Sample3
 */

class Test4Thread extends Thread {
    private volatile boolean stop;

    @Override
    public void run() {
        while ( ! stop){
            System.out.println("Я выполняюсь");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public void myInterrupt(){
        stop = true;
    }
}

public class Sample4 {
    public static void main(String[] args) throws InterruptedException{
        Test4Thread thread = new Test4Thread();
        thread.start();

        Thread.sleep(5000);
        thread.myInterrupt();
    }
}
