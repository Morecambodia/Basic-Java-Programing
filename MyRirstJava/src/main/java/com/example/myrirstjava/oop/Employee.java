package com.example.myrirstjava.oop;

public class Employee extends CalculateAbs implements PeopleInterface {
    String firstName = "Employee 1";
    String lastName = "Last name";

    //Default
    Employee(){
        System.out.println("Default Constructor Name : "+firstName);
    }
    Employee(String name){
        System.out.println("Second Constructor : name "+ name);
    }
    void callFirstName(){
        System.out.println(firstName);
    }

    @Override
    public String getFullName() {
        return firstName;
    }

    @Override
    void onCalculate() {
        int price = 20 + 40;
        System.out.println(price);
    }
}
