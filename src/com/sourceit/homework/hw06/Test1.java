package com.sourceit.homework.hw06;

import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;

/**
 * Created by Still on 02.03.2015.
 */
public class Test1 {
    public static void main(String[] args){
        StringUtils su = new StringUtilsImpl();
        try {
            System.out.println(su.div("5", "1"));
        }catch (NullPointerException a) {
            System.out.println(a.getMessage());
        }catch (NumberFormatException a){
            System.out.println("Error number1 or number 2 are not a numbers");
        }catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }

        String t1 = "ok ok 1 2 3 4";
        String t2 = "by";

        try {
            int [] a;
            a = su.findWord(t1,t2);
            for (int i=0;i<a.length;i++){
                System.out.println(a[i] + " ");
            }
        }catch (NullPointerException q) {
            System.out.println(q.getMessage());
        }

        String t4 = " ";
        String t5 = "4, 8, 5, 9,4";
        try {
            for (int i = 0; i < (su.findNumbers(t4)).length; i++) {
                System.out.println(su.findNumbers(t4)[i] + " ");
            }
        }catch (CustomException a){
            System.out.println(a.getMessage());
        }
    }
}
