package com.sourceit.homework.RecursionHM;

import java.util.Scanner;

/**
 * Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с клавиатуры).
 * Результат должен быть: 2,3,5,7 ...
 * Created by Still on 19.02.2015.
 */
public class Recursion3 {

    public static void main(String[] args) {
        System.out.println("Insert anyone number");
        Scanner a = new Scanner(System.in);
        if (a.hasNextInt()) {
            int k = a.nextInt();
            Recursion3 b = new Recursion3();
            b.rec(k);//rec(k);
            System.out.println(" " + k);
        } else System.out.println("You entered is not a number");
    }

    void rec(int k) {

        for (int i = 2; i < k; i++) {
            if (isPro(i, i - 1))
                System.out.println(i + " ");

        }
    }

    boolean isPro(int p, int w) {

        if (w == 1) return true;
        {
        }
        if (p % w != 0) {
            return isPro(p, w - 1);
        }
        return false;
    }
}


