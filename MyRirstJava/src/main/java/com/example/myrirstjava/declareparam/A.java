package com.example.myrirstjava.declareparam;

public class A {
    int data = 50;
    String firstName  = "Java";
    String first_name = "Testing";
    String first$Name = "Testing 2";
    String _firstName = "My Name";

    static int m = 200;

    public static void main(String[] args){
        System.out.println("Hello from Class A");
        A objectA = new A();
        objectA.method();
        System.out.println("print data: "+objectA.data);
        System.out.println("print firstname: "+objectA.first$Name);
        System.out.println("print firstname: "+A.m);
        String datda[]  = {"ddf", "sadf"};
        for ( String d: datda) {
        }

    }
    void method(){
        int localParam = 100;
        System.out.println("Data from method: "+localParam);
    }
}
