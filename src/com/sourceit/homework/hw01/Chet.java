package com.sourceit.homework.hw01;

import java.util.Scanner;

/**
 * •	Создать программу, проверяющую и сообщающую на экран, является ли целое число,
 * записанное в переменную n, чётным либо нечётным (n – вводит пользователь).
 */
public class Chet {
    public static void main(String[] agrs) {

        System.out.println("Введите целое число");

        Scanner a = new Scanner(System.in);
        int i;
        if(a.hasNextInt()) {

            if (a.nextInt() % 2 == 0) {

                System.out.println("Ваше число четное.");
            } else
                System.out.println("Ваше число не четное");
        }

        else System.out.println("Вы ввели не целое число");
        }
    }
