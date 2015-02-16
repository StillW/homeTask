package com.sourceit.homework.hw03;

/**•	Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 *  Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
 *  Если таких строк несколько, то вывести индекс первой встретившейся из них.
 * Created by Still on 16.02.2015.
 */
public class Mass2 {
    public static void main(String[] args) {

        int [][] Mass = new int[7][4];
        int [] Mas1 = new int[Mass.length];

        for(int i =0;i<Mass.length;i++){
            System.out.print("Line №"+i+" ");

            for(int q=0;q<Mass[i].length;q++){
                Mass[i][q]=(int)(Math.random()*11)-5;
                System.out.print(Mass[i][q]+" ");

                if(q==0)Mas1[i]=Mass[i][q];
                else Mas1[i]*=Mass[i][q];

                if(q==Mass[i].length-1)
                    System.out.println(" ");
            }
        }
        int max=0,max_i=0;

        for(int i=0;i<Mas1.length;i++){

            if(Math.abs(Mas1[i])>max){
                max=Mas1[i];
                max_i=i;
            }
        }
        System.out.println("The line with the largest module to the product of the elements ("+max+") index - "+max_i);
    }
}



