package com.sourceit.homework.hw03;

/**
 * •	Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 * Вывести массив на экран.
 * Created by Still on 16.02.2015.
 */
public class Mass1 {
    public static void main(String[] args) {
        int[][] Mass = new int[8][5];
        for(int q=0;q<Mass.length;q++){
            for(int w=0;w<Mass[q].length;w++){
                Mass[q][w]=(int)(Math.random()*90)+10;
                System.out.print(Mass[q][w]+" ");
            }
            System.out.println(" ");
        }
    }
}
