package ru.evant.learning_java_2nd_edition_oreilly.thread.sample8;

public class TestThread extends Thread {
    private final Counter counter;


    public TestThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(System.currentTimeMillis() % 100);
        } catch (InterruptedException e) {
            return;
        }
        counter.increment();
    }
}
