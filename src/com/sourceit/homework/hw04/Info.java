package com.sourceit.homework.hw04;

/**
 * Created by Still on 23.02.2015.
 */

import java.util.Objects;

public class Info {
    public static void main(String[] args){

            Person p = new Person(28, "Tor Bob", "M");
            System.out.println(p.toString());

            Teacher t = new Teacher(29, "Cat Wom", "F", "Physik",5000);
            System.out.println(t.toString());

            Students s = new Students(22,"Pit Park", "M", "FM050", 3.25);
            System.out.println(s.toString());

            CollageStudent cs = new CollageStudent(22, "Bat Rob", "M", "GH5698", 5.69,20,"Physic");
            System.out.println(cs.toString());

    }
}
