package ru.evant.learning_java_2nd_edition_oreilly.thread.sample9;

// Executor - менеджер задач, в котором задачи выполняются паралельно(упрощенное описание)

// программа вычисляет факториал большого числа

// https://vk.com/bookmarks  Время на видео 1:12:00

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample9 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<BigInteger> future = service.submit(new Calculator(1000));
            BigInteger result = null;

            try {
                result = future.get();
                System.out.println("Результат = " + result);
            } catch (InterruptedException | ExecutionException e){
                System.out.println(e.getCause());
            }
        } finally {
            service.shutdownNow();
        }
    }
}
