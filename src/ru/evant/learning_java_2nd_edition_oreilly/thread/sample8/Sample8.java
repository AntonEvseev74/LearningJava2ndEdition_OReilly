package ru.evant.learning_java_2nd_edition_oreilly.thread.sample8;
/*
 * Пример
 * Когда плохое - volatile
 * и что с этим делать
 */

/*
 * Программу необходимо запустить несколько раз.
 * Вы увидите, что BadCounter иногда выдает неожиданный результат (меньше 100).
 * А GoodCounter, стабильно выдает верный результат (ровно 100).
 */

// https://vk.com/bookmarks  Время на видео 1:02:00

import java.util.ArrayList;
import java.util.List;

public class Sample8 {

    public static void main(String[] args) throws InterruptedException {
        check(new BadCounter());
        check((new GoodCounter()));
    }

    static void check(Counter counter) throws InterruptedException {
        List<TestThread> threads = new ArrayList<>();

        for (int i = 0; i < 100 ; i++) {
            TestThread thread = new TestThread(counter);
            threads.add(thread);
            thread.start();
        }

        for (TestThread thread : threads) thread.join();

        System.out.println(counter);
    }
}
