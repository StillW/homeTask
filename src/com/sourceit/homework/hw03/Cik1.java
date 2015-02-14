package com.sourceit.homework.hw03;

import java.util.Scanner;

/**
 * •	Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
 * (заранее не известно сколько цифр будет в числе).
 *
 * Created by Still on 14.02.2015.
 */
public class Cik1 {
    public static void main(String[] args) {
        int a,b=0;
        System.out.println("Введите любое натуральное число:");
        Scanner x = new Scanner(System.in);
        if(x.hasNextInt()){
            a = x.nextInt();
            while(a != 0) {
                b = b+a%10;
                a/= 10;
            }
            System.out.println("Сумма чисел " +b);
        }
        else System.out.println("Вы ввели не число");

    }

}
