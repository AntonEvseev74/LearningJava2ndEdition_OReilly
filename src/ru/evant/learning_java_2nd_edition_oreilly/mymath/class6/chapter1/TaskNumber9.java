package ru.evant.learning_java_2nd_edition_oreilly.mymath.class6.chapter1;

/*
 * Натуральное число a делится нацело на натуральное число b, если
 * найдется натуральное число c такое, что справедливо равенство
 * a = b * c.
 */

/*
 * Если натуральное число a делится нацело на натуральное число b, то
 * число a называют кратным числа b, а число b - делителем числа a.
 */

/* Запишите все числа, являющиеся делителями каждого из чисел:
 * 1) 15 и 20
 * 2) 7 и 21
 * 3) 24 и 36
 * 4) 20 и 21
 */

public class TaskNumber9 {

    public static void main(String[] args) {
        result(1, 15, 20);
        result(1, 7, 21);
        result(1, 24, 36);
        result(1, 20, 21);
    }

    static void result(int numberTask, int a, int b){
        System.out.print(numberTask + ") " + a + " и " + b + ": ");
        for (int i = Math.min(a, b); i>0; i--){
            double tmpA = (double) a/i;
            double tmpB = (double) b/i;
            if (tmpA%1 == 0 && tmpB%1 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
