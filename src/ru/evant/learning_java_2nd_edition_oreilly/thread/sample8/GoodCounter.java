package ru.evant.learning_java_2nd_edition_oreilly.thread.sample8;

import java.util.concurrent.atomic.AtomicInteger;

public class GoodCounter implements Counter {
    private AtomicInteger x = new AtomicInteger();


    @Override
    public void increment() {
        x.getAndIncrement();
    }

    @Override
    public String toString(){
        return "GoodCounter = " + x.get();
    }
}
