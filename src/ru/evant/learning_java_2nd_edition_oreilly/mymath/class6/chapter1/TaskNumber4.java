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

/* Запишите все делители числа:
 * 1) 18
 * 2) 8
 * 3) 13
 * 4) 56
 */

public class TaskNumber4 {

    public static void main(String[] args) {
        result(1, 18);
        result(2, 8);
        result(3, 13);
        result(4, 56);
    }

    static void result(int numberTask, int a){
        System.out.print(numberTask + ") " + a + ": ");
        for (int i = a; i>0; i--){
            double tmp = (double) a/i;
            if (tmp%1 == 0) {
                System.out.print((a/i) + " ");
            }
        }
        System.out.println();
    }
}
