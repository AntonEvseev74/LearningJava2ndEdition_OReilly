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

/* Запишите пять чисел, кратных числу:
 * 1) 7
 * 2) 30
 * 3) 100
 * 4) 34
 */

public class TaskNumber6 {

    public static void main(String[] args) {
        result(1, 7);
        result(1, 30);
        result(1, 100);
        result(1, 34);
    }

    static void result(int numberTask, int a){
        System.out.print(numberTask + ") " + a + ": ");
        for (int i = 1; i<=5; i++){
            System.out.print((a*i) + " ");
        }
        System.out.println();
    }
}
