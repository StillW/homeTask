package com.sourceit.homework.hw01;

/**
 * •	Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
 * Created by Still on 11.02.2015.
 */
public class TriZnaka {
    public static void main(String[] args) {

        int a = (int) (Math.random() * 900 + 100);
        int q = a % 10, w = (a / 100) % 10, e = (a / 10) % 10;
        if (q > w && q > e)
            System.out.println("В числе " + a + " наибольшая цифра " + q);
        else if (q < w && q > e)
            System.out.println("В числе " + a + " наибольшая цифра " + w);
        else if (q < w && q < e)
            System.out.println("В числе " + a + " наибольшая цифра " + e);
    }
}