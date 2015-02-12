package com.sourceit.homework.hw01;

import java.awt.*;
import java.util.Date;

/**
 * 	Создать класс Dog, который будет содержать 2 поля name и says.
 * В main( ) создать 2 экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля объектов.
 * Created by Still on 10.02.2015.
 */
public class Main {
    public static void main(String[] args) {

        Dog a = new Dog();
        Dog b = new Dog();
        a.name = "Spot";
        a.says = "Ruff";
        b.name = "Scruffy";
        b.says = "Wuff";
        System.out.println(a.name+ " " +a.says);
        System.out.println(b.name+ " " +b.says);


            }

}
