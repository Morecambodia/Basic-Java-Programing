package com.example.myrirstjava.basicoperator;

import java.lang.reflect.Array;

public class BasicOperator {
    int num1 = 10;
    int num2 = 50;

    int num3 = 10;
    int num4 = 10;

    int result = 0;

    public static void main(String[] agrs){
        System.out.println("Basic Operation");
        BasicOperator objBasicOperator = new BasicOperator();
        //objBasicOperator.onCalculate();
        //objBasicOperator.onRelationalOperator();
        //objBasicOperator.onLogicalOperator();
        objBasicOperator.onAssignmentOperators();
    }
    void onCalculate(){
        result = num1 + num2;
        System.out.println("Added result: "+result);
        result = num1 - num2;
        System.out.println("Sub result: "+result);
        result = num1 * num2;
        System.out.println("Mul result: "+result);
        result = num1 / num2;
        System.out.println("Devi result: "+result);
        result = num1 % num2;
        System.out.println("Compute result: "+result);
    }
    void onRelationalOperator(){
        boolean result = false;
        result = num1 < num2;
        System.out.println(" result < : " + result);
        result = num2 > num1;
        System.out.println(" result > : " + result);

        result = num3 <= num4;
        System.out.println(" result <= : " + result);
        result = num1 >= num3;
        System.out.println(" result >= : " + result);

        result = num3 == num4;
        System.out.println(" result == : " + result);

        result = num1 != num2;
        System.out.println(" result != : " + result);

    }
    void onLogicalOperator(){
        boolean num1 = false;
        boolean num2 = true;
        boolean num3 = true;
        boolean num4 = false;
        boolean result = false;

        result = !num1;
        System.out.println("!  = "+result);
        result = num2 & num3;
        System.out.println("&&  = "+result);
        result = num1 || num4;
        System.out.println("||  = "+result);
    }
    void onAssignmentOperators(){
        int num1 = 10;
        int num2 = 20;
        int result  = 0;

        result = num1;
        System.out.println("= : "+result);
        result += num1;
        System.out.println("= : "+result);
        result -= num1;
        System.out.println("= : "+result);
        result /= num1;
        System.out.println("= : "+result);
        result %= num1;
        System.out.println("= : "+result);
    }

    void onDataType(){
        //primitive data type
        int num = 10;
        double num1 = 20;
        double d = 20;

        //no-primitive data type
        Array data = null;
        String name = "";
        BasicOperator basicOperator = null;
        MyCalling  myCalling = null;
    }

    interface  MyCalling {

    }
}
