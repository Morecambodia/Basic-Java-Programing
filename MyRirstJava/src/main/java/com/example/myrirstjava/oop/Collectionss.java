package com.example.myrirstjava.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Collectionss {
    public static void main(String[] args){
        System.out.println("Print Collections");
        Collectionss collections = new Collectionss();
        //collections.onArrayList();
        collections.onArraySort();
    }
    void onArrayList(){
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Nemo");
        arrayList.add("Darith");
        arrayList.add("Java");
        arrayList.add("IOS");
        arrayList.add("IOS");
        arrayList.add(1, "New Data");

        ArrayList<String> otherArray = new ArrayList();
        otherArray.add("Other 1");
        otherArray.add("Other 2");
        otherArray.add("Other 3");
        System.out.println("Before remove size : "+arrayList.size());

        arrayList.addAll(otherArray);

        System.out.println("After remove size : "+arrayList.size());

        for(int i = 0; i< arrayList.size() ; i++){
            System.out.println(arrayList.get(i));
        }
        Iterator iterable = arrayList.iterator();
        if(iterable.hasNext()){
            System.out.println(iterable.next());
        }


        //Random random = new Random();
        //nextInt(
        // add, size, remove, get(index)
        // if size == 10 => index => 9
        //Random
        //rand.nextInt(givenList.size()))
       // System.out.println(arrayList.get(random.nextInt(arrayList.size())));
        //        for(int i = 0; i < arrayList.size();i++ ){
    //            System.out.println(arrayList.get(i));
        //        }


    }
    void onArraySort(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(30);
        list.add(20);
//        for(int i =0; i< list.size(); i++){
//            System.out.println(list.get(i));
//        }
        Collections.sort(list);
        System.out.println("=============================");
        for(int i =0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("=============================");
        Collections.reverse(list);
        for(int i =0; i< list.size(); i++){
            System.out.println(list.get(i));
        }



    }
}
