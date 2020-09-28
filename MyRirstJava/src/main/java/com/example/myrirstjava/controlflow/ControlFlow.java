package com.example.myrirstjava.controlflow;

public class ControlFlow {
    public static void main(String[] agrs){
        System.out.println("Control Flow");
        ControlFlow controlFlow = new ControlFlow();
        //controlFlow.onWhile();
        //controlFlow.onDoWhile();
        //controlFlow.onContinue();
        //controlFlow.onBreak();
        controlFlow.onForLoop();
    }
    void onWhile(){
        int num = 0;
        while (num < 10){
            System.out.println("Print inside loop: "+num);
            num+=1;
        }
        System.out.println("Print outside loop");
        System.out.println("========================");

        int num2 = 0;
        while (num2 <= 10){
            System.out.println("Print inside loop: "+num2);
            num2+=1;
        }
        System.out.println("Print outside loop");
        System.out.println("========================");
        int num3 = 10;
        while (num3 < 10){
            System.out.println("Print inside loop: "+num3);
            num3 +=1;
        }
        System.out.println("Print outside loop");
    }
    void onDoWhile(){
        int num = 0;
        do {

           System.out.println("Print inside loop: " + num);
           num+=1;

        }while (num < 10);

        System.out.println("Print outside do-while");
    }

    void onContinue(){
        int num = 0;
        do{
            num+=1;
            if(num == 5){
                continue;
            }
            System.out.println("Print inside loop: "+num);
        }while (num < 10);

        System.out.println("Print outside loop");
    }

    void onBreak(){
        int num = 0;
        do{
            num+=1;
            if(num == 6){
                break;
            }
            System.out.println("Print inside loop: "+ num);
        }while (num < 10);

        System.out.println("Print outside loop");
    }

    void onForLoop(){
        int num = 0;
        for(num = 0; num < 10;num++){
            System.out.println("Print inside loop"+ num);
        }
        System.out.println("Print outside loop");
    }


}
