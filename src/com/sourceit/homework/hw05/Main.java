package com.sourceit.homework.hw05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Still on 28.02.2015.
 */
public class Main {
    public static void main(String[] args){
        FractionNumber fn1 = new FractionNumber();
        fn1.setDividend(3);
        fn1.setDivisor(9);
        System.out.println(fn1.toString()+"="+fn1.doubleValue());

        FractionNumber fn2 = new FractionNumber();
        fn2.setDivisor(5);
        fn2.setDividend(10);
        System.out.println(fn2.toString()+"="+fn2.doubleValue());

        FractionNumberOperation fnw = new FractionNumberOperation();

        System.out.println("The add: " +fnw.add(fn1,fn2) + " = " + fnw.add(fn1,fn2).doubleValue());
        System.out.println("The sub: " +fnw.sub(fn1, fn2) + " = " + fnw.sub(fn1, fn2).doubleValue());
        System.out.println("The mul: " +fnw.mul(fn1, fn2) + " = " + fnw.mul(fn1, fn2).doubleValue());
        System.out.println("The div: " +fnw.div(fn1, fn2) + " = " + fnw.div(fn1, fn2).doubleValue());
        System.out.println();

        System.out.println("Not Sort");
        FractionNumber[] arr = new FractionNumber[5];
        for (int i = 0; i<arr.length;i++){
            FractionNumber fn = new FractionNumber();
            fn.setDividend(1+(int)(Math.random()*150));
            fn.setDivisor((int)(Math.random()*120));
            arr[i]=fn;
        }
        for (FractionNumber i : arr){
            System.out.print(Objects.toString(i) + " ");
        }

        System.out.println();
        System.out.println("Sort  ");

        Arrays.sort(arr, new Comparator<FractionNumber>() {
            @Override
            public int compare(FractionNumber z1, FractionNumber z2) {
                return z1.compareTo(z2);
            }
        });

        for (FractionNumber sort:arr){
            System.out.print(Objects.toString(sort)+" ");
        }

        System.out.println();
        for (FractionNumber sort: arr){
            System.out.println(sort.doubleValue()+" ");
        }

        }

    }

