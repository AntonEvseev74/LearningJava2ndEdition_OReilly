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

/* Запишите четыре числа, кратных числу:
 * 1) 16
 * 2) 12
 * 3) 150
 * 4) 47
 */

public class TaskNumber7 {

    public static void main(String[] args) {
        result(1, 16);
        result(1, 12);
        result(1, 150);
        result(1, 47);
    }

    static void result(int numberTask, int a){
        System.out.print(numberTask + ") " + a + ": ");
        for (int i = 1; i<=4; i++){
            System.out.print((a*i) + " ");
        }
        System.out.println();
    }
}
