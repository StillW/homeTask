package com.sourceit.homework.hw06;

import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Still on 02.03.2015.
 */
public class StringUtilsImpl implements StringUtils{

    @Override
    public double div(String n1, String n2) throws NullPointerException, ArithmeticException, NumberFormatException {

        if (n1 == null || n2 == null) {
            throw new NullPointerException("Error n1 or n2 = null");
        }
        double k1;
        double k2;

        try {
            k1 = Double.parseDouble(n1);
        } catch (Exception e) {
            throw new NumberFormatException("Not a number");
        }
        try {
            k2 = Double.parseDouble(n2);
        } catch (Exception e) {
            throw new NumberFormatException("Not a number");
        }
        if (k2 == 0) {
            throw new ArithmeticException("You can not divide by zero");
        }
            return k1 / k2;
        }

        @Override
        public int[] findWord(String t1, String t2) throws NullPointerException {
            String t3 = null;

            if (t3.equals(t1)) throw new NullPointerException("Error text = null");
            if (t3.equals(t2)) throw new NullPointerException("Erroe text = null");
            ArrayList list = new ArrayList<Integer>(); //http://developer.alexanderklimov.ru/android/java/arraylist.php
            ArrayList list2 = new ArrayList<String>(); //http://habrahabr.ru/post/128269/
            int d = 0;
            String[] strings;
            strings = toString().split(" ");
            for (String f : strings) {
                if (f.equals(t2)) {
                    list.add(d);
                }
                d++;
            }

            if ((list.toArray()).length == 0) throw new NullPointerException("Error");
            int[] a = new int[(list.toArray()).length];
            for (int i = 0; i < a.length; i++) {
               a[i] = (Integer)((list.toArray())[i]);
            }
            return a;
        }


        @Override
        public double[] findNumbers(String g) throws CustomException{
            ArrayList<Double>stArray = new ArrayList<Double>();
            Pattern pat1 = Pattern.compile("([-+]?\\d+(?:\\.\\d+))"); //http://www.javaportal.ru/java/articles/regexp.html
            Matcher mat1 = pat1.matcher(g); //http://www.quizful.net/post/Java-RegExp

            double d;
            while(mat1.find()){
                d = Double.parseDouble(mat1.group(1));
                stArray.add(d);
            }
            if (stArray.size()==0){
                throw new CustomException("No doubt");
            }
            double[] doulesArray = new double[stArray.size()];
            for (int i=0;i<stArray.size();i++){
                doulesArray[i] = stArray.get(i);
            }
            return doulesArray;
        }


        }





