package ru.evant.learning_java_2nd_edition_oreilly.thread.sample11;

import java.util.concurrent.Callable;

public class Counter implements Callable<Long> {
    private final int[] array; // массив
    private final int from; // индекс элемента начала диапазона
    private final int to; // индекс последнего элемента в диапазоне

    public Counter(int[] array, int from, int to){
        this.array = array;
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        long result = 0;

        for (int i = from; i < to; i++){
            result += array[i];
        }
        return result;
    }
}
