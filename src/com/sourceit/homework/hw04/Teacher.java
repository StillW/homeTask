package com.sourceit.homework.hw04;

/**
 * Created by Still on 22.02.2015.
 */
public class Teacher extends Person {

    private double salary;
    private String subject;

    Teacher(int age, String name, String gender, String subject, double salary){
        super(age,name,gender);

        this.subject = subject;
        this.salary = salary;
       // super.name = name;
       // super.age = age;
       // super.gender = gender;
    }


    double getSalary(){
        return salary;
    }
    String getSubject(){
        return subject;
    }
    void setSalary(double newSalary){
        salary=newSalary;
    }
    void setSubject(String newSubject){
        subject=newSubject;
    }



    @Override
    public String toString(){
        return (super.toString())+", Subject: "+this.subject+", Salary: "+this.salary;
    }


}
