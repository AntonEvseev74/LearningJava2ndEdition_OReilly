package ru.evant.learning_java_2nd_edition_oreilly.thread.sample11;

// https://vk.com/bookmarks  Время на видео 1:31:00
// Тюнинг 10го примера

import java.util.Arrays;
import java.util.concurrent.*;

public class Sample11 {
    static final int THREADS_COUNT = 4; // Количество потоков
    static final int PART_LENGTH = 10000000; // Длинна части массива

    public static void main(String[] args) {
        int[] array = new int[THREADS_COUNT * PART_LENGTH]; // создаем массив для 40 000 000 элементов
        Arrays.fill(array, 1); // Заполняем массив, каждому элементу массива присваиваем значение 1

        ExecutorService service = Executors.newFixedThreadPool(THREADS_COUNT); // Создаем 4 потока
        CompletionService<Long> completionService = new ExecutorCompletionService<>(service); // пул результатов 4х потоков, резкльтаты можно получать по мере завершения потока
        int offset = 0;
        long result = 0;

        try {
            // Создаем 4 потока
            for (int i = 0; i < THREADS_COUNT; i++) {
                Counter counter = new Counter(array, offset, offset + PART_LENGTH);
                offset += PART_LENGTH;

                completionService.submit(counter);
            }

            // Получаем результат вычислений всех 4х потоков
            // Вычисляем результат суммы всех элементов массива
            for (int i = 0; i < THREADS_COUNT; i++) {
                try {
                    Future<Long> future = completionService.take(); // Получаем результат из первого завершенного потока
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
