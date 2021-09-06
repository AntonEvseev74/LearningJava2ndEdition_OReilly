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
 * 1) 12 и 18
 * 2) 60 и 90
 * 3) 22 и 35
 * 4) 9 и 27
 */

public class TaskNumber10 {

    public static void main(String[] args) {
        result(1, 12, 18);
        result(1, 60, 90);
        result(1, 22, 35);
        result(1, 9, 27);
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
