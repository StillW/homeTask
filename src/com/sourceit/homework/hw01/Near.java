package com.sourceit.homework.hw01;

import java.util.Scanner;

/**
 * Created by Still on 11.02.2015.
 * •	Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m – вводит пользователь).
 */
public class Near {
    public static void main(String[] agrs) {

        System.out.println("Введите любое целое число");
        Scanner a = new Scanner(System.in);
        if (a.hasNextDouble()) {
            double m = a.nextDouble();

            System.out.println("Введите Второе целое число");
            Scanner b = new Scanner(System.in);
            if (b.hasNextDouble()) {
                double n = b.nextDouble();

                double i = Math.abs(10 - n), t = Math.abs(10 - m);

                if (i > t) {

                    System.out.println("Ближайшее число к 10 число " + m);

                } else System.out.println("Ближайшее число к 10 число " + n);

            } else System.out.println("Вы ввели не число");

        } else System.out.println("Вы ввели не число");
    }

}