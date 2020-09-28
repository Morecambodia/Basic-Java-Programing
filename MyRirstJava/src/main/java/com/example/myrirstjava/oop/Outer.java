package com.example.myrirstjava.oop;

public class Outer {
    private String nameOuter = "Outer class";
    final String sName = "testing";
    class Inner {
        void onCallInner(){
            System.out.println("Call in Inner class"+nameOuter);
        }
    }
    static class InnerStatic{
        void onCallInner(){
            System.out.println("Call in Inner Static class");
        }
    }
    void onInnerClassMethod(){
        final String data = "testing";
        class Inner{
            void onCallInner(){
                System.out.println("Print from Inner class method "+data);
            }
        }
        Inner inner = new Inner();
        inner.onCallInner();
    }
}
