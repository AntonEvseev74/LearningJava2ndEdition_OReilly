package ru.evant.learning_java_2nd_edition_oreilly.thread.sample10;

// https://vk.com/bookmarks  Время на видео 1:25:00

// Программа считает сумму элементов массива параллельно
// массив разбивается на 4 части, паралльно происходит вычисление  каждой части
// после этого результаты складываются

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample10 {
    static final int THREADS_COUNT = 4; // Количество потоков
    static final int PART_LENGTH = 10000000; // Длинна части массива

    public static void main(String[] args) {
        int[] array = new int[THREADS_COUNT * PART_LENGTH]; // создаем массив для 40 000 000 элементов
        Arrays.fill(array, 1); // Заполняем массив, каждому элементу массива присваиваем значение 1

        ExecutorService service = Executors.newFixedThreadPool(THREADS_COUNT); // Создаем 4 потока
        List<Future<Long>> results = new ArrayList<>(); // Список результатов полученных из 4х потоков
        int offset = 0;
        long result = 0;

        try {
            // Создаем 4 потока
            for (int i = 0; i < THREADS_COUNT; i++) {
                Counter counter = new Counter(array, offset, offset + PART_LENGTH);
                offset += PART_LENGTH;

                Future<Long> future = service.submit(counter);
                results.add(future);
            }

            // Получаем результат вычислений всех 4х потоков
            // Вычисляем результат суммы всех элементов массива
            for (Future<Long> future : results) {
                try {
                    result += future.get();
                } catch (InterruptedException | ExecutionException e){
                    e.printStackTrace();
                    return;
                }
            }

            System.out.println("Результат = " + result);
        } finally {
            service.shutdownNow();
        }
    }
}
