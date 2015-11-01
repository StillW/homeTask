package com.sourceit.homework.hw04;

/**
 * Created by Still on 22.02.2015.
 */
public class CollageStudent extends Students{

    int year;
    String major;

    int getYear(){
        return year;
    }
    String getMajor(){
        return major;
    }

    void setYear(int newYear){
        year = newYear;
    }
    void setMajor(String newMajor){
        major=newMajor;
    }

    CollageStudent(int age, String name, String gender, String idNumber, double GPA, int year, String major){
        super(age, name,gender,idNumber,GPA);
        //super.age = age;
        //super.name = name;
        //super.gender = gender;
       // super.GPA = GPA;
        //super.idNumber = idNumber;
        this.year = year;
        this.major = major;
    }


    @Override
    public String toString() {
        return super.toString() + ", Student id: " + super.idNumber + ", GPA: " +
                super.GPA + ", Year: " + this.year + ", Major: " + this.major;
    }
}

