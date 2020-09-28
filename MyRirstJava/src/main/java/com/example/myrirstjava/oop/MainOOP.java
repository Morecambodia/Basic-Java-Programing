package com.example.myrirstjava.oop;

public class MainOOP {
    public static void main(String[] agrs){
        System.out.println("Print Main OOP");
        Student student = new Student("My Name", "Java");
        String firstName = student.getFirstName();
        System.out.println("Print First name: "+firstName);
        System.out.println("Print full name: "+student.getFullName());

        Employee employee = new Employee();
        Employee employee1 = new Employee("Employee 2");
        Employee employee2 = new Employee("Employee 3");

        String fullNameFromStudent = student.getFullName();
        System.out.println("Name from Student: "+fullNameFromStudent);
        String fullNameFromEmplyee = employee.getFullName();
        System.out.println("Name from Emplyee: "+fullNameFromEmplyee);

        student.onCalculate();
        employee.onCalculate();

    }
}
