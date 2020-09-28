package com.example.myrirstjava.oop;

public class Student extends CalculateAbs implements PeopleInterface {
    String gender  = "M";
    String firstName = "Nemo";
    String lastName = "Titi";

    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    String getFirstName(){
        return firstName;
    }

    @Override
    public String getFullName() {
        return firstName;
    }

    @Override
    void onCalculate() {
        int price = 20 * 20;
        System.out.println(price);
    }
}
