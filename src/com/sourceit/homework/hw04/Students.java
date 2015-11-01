package com.sourceit.homework.hw04;

/**
 * Created by Still on 22.02.2015.
 */
public class Students extends Person{

    protected String idNumber;
    protected double GPA;


    String getIdNumber(){
        return idNumber;
    }
    double getGPA(){
        return GPA;
    }
    void setIdNumber(String newIdNumber){
        idNumber = newIdNumber;
    }
    void  setGPA(double newGPA){
        GPA=newGPA;
    }

    Students(int age, String name, String gender, String idNumber,double GPA){
        super(age,name,gender);

        this.GPA = GPA;
        this.idNumber = idNumber;
        //super.name = name;
        //super.age = age;
        //super.gender =gender;
    }

    @Override
    public String toString() {
        return super.toString() + ", IdNumber " + this.idNumber + ", GPA " + this.GPA;
    }


}
