package com.example.myrirstjava.decisionmaking;

public class DecisionMaking {
    public static void main(String[] agrs){
        System.out.println("Decision Making");
        DecisionMaking decisionMaking = new DecisionMaking();
        //decisionMaking.onDecisionMakingIF();
        //decisionMaking.onDecisionMakingIFElse();
        //decisionMaking.onDecisionMakingIFElseIfElse();
        //decisionMaking.onNestedIf();
        decisionMaking.onSwitch();
    }
    void onDecisionMakingIF(){
        int num = 5;
        if(num >= 5){
            System.out.println("Print inside if");
        }
        System.out.println("Print outside if");
    }
    void onDecisionMakingIFElse(){
        String leng = "Java";
        if(leng == "Java"){
            System.out.println("Yes, It's Java");
        }else{
            System.out.println("Yes,  No this is not");
        }
        System.out.println("Print outside if and else");
    }
    void onDecisionMakingIFElseIfElse(){
        int num = 5;
        if(num > 10){
            System.out.println("Num > 10");
        }else if(num < 5){
            System.out.println("Num < 5");
        }else if(num == 5) {
            System.out.println("Num == 5");
        }else {
            System.out.println("Print inside else");
        }
        System.out.println("Print inside function");
    }
    void onNestedIf(){
        int num = 5;
        if(num <= 5){
            System.out.println("Print num <= 5");
            if(num != 4){
                System.out.println("Print num != 5");
            }else{
                System.out.println("Print num == 5");
            }
        }else{
            System.out.println("Print inside else");
        }
        System.out.println("Print inside function");
    }
    void onSwitch(){
        int num  = 4;
        switch (num){
            case 1:
                System.out.println("Print case 1" + num);
                break;
            case 3:
                System.out.println("Print case 3" + num);
                break;
            case 4:
                System.out.println("Print case 4" + num);
                break;
            case 10:
                System.out.println("Print case 10: " + num);
                break;
            default:
                System.out.println("Print default switch");
        }
    }

}
