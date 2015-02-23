package com.sourceit.homework.RecursionHM;

import java.util.Scanner;

/**
 * Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются размером и лежат меньшее на большем.
 * Требуется перенести пирамиду из N колец с одного стержня на другой за наименьшее число ходов.
 * За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.
 * Created by Still on 19.02.2015.
 */
// Это не фурычит. не проверять

public class Recursion4 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of circles ");
        int a = sc.nextInt();

        int fc = 1;
        int tc = 2;
        int vc = 3;

        fun(a, fc, tc, vc);

        System.out.println("Movies " + count);
    }


    static void fun(int a, int fc, int tc, int vc) {
        if (a != 0)

        {
            count++;
            fun(a - 1, fc, tc, vc);
            System.out.println(fc + " to " + tc);
            fun(a - 1, vc, tc, fc);
        }
    }
}



