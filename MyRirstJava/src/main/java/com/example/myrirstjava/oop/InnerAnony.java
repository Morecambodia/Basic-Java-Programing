package com.example.myrirstjava.oop;

interface InterInterface {
    void show();
}
public class InnerAnony implements InterInterface{
    @Override
    public void show() {
        System.out.println("Inside InnerAnony");
    }
}
