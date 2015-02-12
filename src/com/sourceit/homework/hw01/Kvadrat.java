package com.sourceit.homework.hw01;

import java.util.Scanner;

/**
 * •	В три переменные a, b и c записаны три вещественных числа. Создать программу,
 * которая будет находить и выводить на экран вещественные корни квадратного уравнения ax^2+bx+c=0, либо сообщать,
 * что корней нет (a, b и c – вводит пользователь).
 * Created by Still on 11.02.2015.
 */
public class Kvadrat {

    public static void main(String[] args) {


                     System.out.println("Введите переменную а");
                         Scanner q = new Scanner(System.in);
                         if (q.hasNextFloat()) {
                         float a = q.nextFloat();

                            System.out.println("Введите переменную b");
                            Scanner w = new Scanner(System.in);
                            if (w.hasNextFloat()) {
                            float b = w.nextFloat();

                                  System.out.println("Введите переменную с");
                                  Scanner e = new Scanner(System.in);
                                  if (e.hasNextFloat()) {
                                  float c = e.nextFloat();


                    double d = (b * b) - (4 * a * c);
                    float z = 0;
                    float g = 0;
                                if (d == 0) {
                                   z = -1 * (b / (2 * a));
                                   System.out.println("Уравнеие имеет один квадратный корень " + z);
                                      } else
                                         if (d > 0) {
                                           z = ((-1 * b) + (float) Math.sqrt(d)) / (2 * a);
                                              g = ((-1 * b) - (float) Math.sqrt(d)) / (2 * a);
                                             System.out.println("Уравнение имеет два квадратных корня: " + z + " и " + g);
                                } else
                                System.out.println("нет квадратных корней");


                        } else System.out.println("Вы ввели не число");

                    } else System.out.println("Вы ввели не число");

                } else System.out.println("Вы ввели не число");

            }
        }



