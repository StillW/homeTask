package com.sourceit.homework.hw01;

import java.util.Scanner;

/**
 * •	Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
 * целое число в интервал (25;100) и сообщать результат на экран.
 * Created by Still on 11.02.2015.
 */
public class Otrez2 {
    public static void main(String[] agrs) {

        System.out.println("Введите любое целое число из интервала [5;155]");
        Scanner a = new Scanner(System.in);
        if (a.hasNextInt()) {
            int n = a.nextInt();
                if (n>=5 && n<=155) {
                    if (n>25 && n<100){
                        System.out.println("Ваше число попало в отрезок (25;100)");

                    }else System.out.println("Ваше число не попало в отрезок (25;100)");

                }else System.out.println("Вы ввели число не из заданного интервала");


        } else System.out.println("Вы ввели не целое число");

    }
}