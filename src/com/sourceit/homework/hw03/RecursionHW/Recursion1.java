package com.sourceit.homework.hw03.RecursionHW;

import java.util.Scanner;

/**
 * •	Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;
 * Created by Still on 19.02.2015.
 */
public class Recursion1 {
    public static void main(String[] args) {
        System.out.println("Insert anyone number");
        Scanner a = new Scanner(System.in);
        if (a.hasNextInt()) {
            int k=a.nextInt();
            System.out.println(rec(k));
        } else System.out.println("You entered is not a number");
    }

        public static int rec ( int k){
            System.out.println(" " + k);
            if (k == 0) return 1;
            if (k == 1) return 1;
            return rec(k-1)+(k);
        }


    }

