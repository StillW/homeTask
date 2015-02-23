package com.sourceit.homework.hw04;

/**
 * Created by Still on 22.02.2015.
 */
public class Person {
    int age;
    String gender;
    String name;

    public Person(int age, String name, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
           }


    int getAge(){
        return  age;
    }
    String getGender(){
        return  gender;
    }
    String getName(){
        return name;
    }
    void setAge(int newAge){
        age = newAge;
    }
    void setGender(String newGender){
        gender = newGender;
    }
    void setName(String newName){
        name = newName;
    }
    @Override
    public String toString() {
        return this.age + ", Name: " + this.name + ", Gender: " + this.gender;
    }
}
