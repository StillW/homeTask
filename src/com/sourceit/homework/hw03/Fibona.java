package com.sourceit.homework.hw03;

/**
 * •	Выведите на экран первые 11 членов последовательности Фибоначчи.
 * Напоминаем, что первый и второй члены последовательности равны единицам,
 * а каждый следующий — сумме двух предыдущих.
 * Created by Still on 14.02.2015.
 */
public class Fibona {
    public static void main(String[] args) {
        int a=1,b=1,c;
        System.out.println("Thats first two numbers of sequence " +a+ " and "+b);

        for (int q=1;q<9;q++){
            c = a+b;
            a=b;
            b=c;
            System.out.println("next members of the sequence " +c+ " ");
        }
    }
}
