package com.sourceit.homework.hw01;

import java.util.Scanner;

/**
 * •	Натуральное положительное число записано в переменную n.
 * Создайте программу, которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [-n;n]
 * (n – вводит пользователь).
 */
public class Otrez {
    public static void main(String[] agrs) {

        System.out.println("Введите любое целое число");
        Scanner a = new Scanner(System.in);
        if(a.hasNextInt()) {
            int n = a.nextInt();

                System.out.println("Случайное число из отрезка вашего числа "+(int)(Math.random()*(2*n+1)-n));

        }else System.out.println("Вы ввели не целое число");

    }
}
