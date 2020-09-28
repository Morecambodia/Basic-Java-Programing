package com.example.myrirstjava.oop;

public class NestedClass {
    public static  void main(String[] args){
        System.out.println("Nested Class");

        Outer.Inner inner = new Outer().new Inner();
        inner.onCallInner();

        Outer outer = new Outer();

        Outer.Inner inner1 = outer.new Inner();
        inner1.onCallInner();

        Outer.InnerStatic inner2 =  new Outer.InnerStatic();
        inner2.onCallInner();

        outer.onInnerClassMethod();

        anonyClass.onCallAnoy();
        anonyInterface.onShow();
        innerAnony.show();

        Cat cat = new Cat();
        cat.setName("Cat 3");
        cat.setGender("M");

        Dog dog = new Dog();
        dog.setName("Dog 1");
        dog.setGender("F");

        System.out.println("Cat Info: " + cat.getName() + " - "+ cat.getGender());
        System.out.println("Dog Info: " + dog.getName() + " - "+ dog.getGender());

    }
    static InnerAnony innerAnony = new InnerAnony(){
        @Override
        public void show(){
            super.show();
            System.out.println("Print inside static class");
        }
    };
    static AnonyInterface anonyInterface = new AnonyInterface() {
        @Override
        public void onShow() {
            System.out.println("Print onShow()");
        }
    };

    static AnonyClass anonyClass = new AnonyClass(){
        @Override
        void onCallAnoy(){
            testing();
        }

        public void testing(){
            System.out.println("Create inside Anony class from NestClass");
        }
    };

}
