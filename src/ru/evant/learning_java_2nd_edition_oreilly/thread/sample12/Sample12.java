package ru.evant.learning_java_2nd_edition_oreilly.thread.sample12;

// https://vk.com/bookmarks  Время на видео 1:31:00

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Timer implements Runnable {

    @Override
    public void run() {
        System.out.println("Тик");
    }
}

public class Sample12 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        try {
            service.scheduleWithFixedDelay(new Timer(), 5, 3, TimeUnit.SECONDS); // класс Timer, 5(первое выполнение через 5), 3(остальные выполнения каждые 3), ед.изм. времени
            Thread.sleep(20000); // прервать поток через 20 сек
        } finally {
            service.shutdown();
        }
    }
}
