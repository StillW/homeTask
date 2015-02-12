package com.sourceit.homework.hw01;

import java.util.Scanner;

/**
 * •	В переменной n хранится натуральное двузначное число. Создайте программу,
 * вычисляющую и выводящую на экран сумму цифр числа n (n – вводит пользователь).
 */
public class Summ {
    public static void main(String[] agrs) {

        System.out.println("Введите целое число");

        Scanner a = new Scanner(System.in);
            if(a.hasNextInt()) {
                int i = a.nextInt();
                if (i > 9 && i < 100) {
                    int b = i % 10, c = (int) i / 10;
                    System.out.println(b + c);
                }
                else System.out.println("Вы ввели не двухзначное число");
            }else System.out.println("Вы ввели не целое число");

        //System.out.println(b=i%10);

    }
}
