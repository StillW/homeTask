package com.sourceit.homework.hw01;

import java.awt.*;
import java.util.Date;

/**
 * Created by Still on 10.02.2015.
 */
public class Main {
    public static void main(String[] args) {

        Dog a = new Dog();
        Dog b = new Dog();
        a.name = "Spot";
        a.says = "Ruff";
        b.name = "Scruffy";
        b.says = "Ruff";
        System.out.println(a.name+ " " +a.says);
        System.out.println(b.name+ " " +b.says);


            }

}
