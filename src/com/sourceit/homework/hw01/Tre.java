package com.sourceit.homework.hw01;

import java.util.Scanner;

/**
 * •	В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 * Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит пользователь).
 * Created by Still on 11.02.2015.
 */
public class Tre {
    public static void main(String[] agrs) {

        System.out.println("Введите длину первого катета");
        Scanner a = new Scanner(System.in);
        if (a.hasNextDouble()) {
            double m = a.nextDouble();

            System.out.println("Введите длинну второго катета");
            Scanner b = new Scanner(System.in);
            if (b.hasNextDouble()) {
                double n = b.nextDouble();
                //Площадь прямоугольного треугольника равна половине произведения катетов треугольника:
                System.out.println("Площадь прямоугольного теругольника с катетами которые вы ввели " +(m+n)/2);

                double x=Math.sqrt(m*m+n*n); //вычесляем гипотенузу по теореме Пифагора

                System.out.println("Периметр прямоугольного теругольника с катетами которые вы ввели " + (double)(m+n+x));

            } else System.out.println("Вы ввели не число");

        } else System.out.println("Вы ввели не число");
    }
 }

