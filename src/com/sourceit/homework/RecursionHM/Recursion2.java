package com.sourceit.homework.RecursionHM;

/**
 * •	Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент последовательности
 * Фибоначчи для вычисления пятнадцатого элемента.
 * Created by Still on 19.02.2015.
 */
public class Recursion2 {
  static int q=0;
    public static void main(String[] args) {
        int k=16;
        System.out.print("The sequence of Fibonacci from 1 to 15 ");
        for(int a=0; a<k;a++){
            System.out.print(rec(a)+" ");
        }
        System.out.println("The quantity being computed fourth element  "+q);

    }
    public static int rec(int k){
        if(k==4)
            q++;
        if ((k==0)||(k==1)){
            return 1;
        }
        return rec(k-2)+ rec(k-1);
    }

}