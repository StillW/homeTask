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
            rec(k);
            System.out.println(" " + k);
        } else System.out.println("You entered is not a number");
    }

           public static int rec ( int q){

            if (q > 2) {
                q = q - 1;
                rec(q);
                System.out.println(" " + q);
                return q;
            }

            return 2;
        }
    }


