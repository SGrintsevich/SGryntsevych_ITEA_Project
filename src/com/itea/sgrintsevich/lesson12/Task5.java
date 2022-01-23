package com.itea.sgrintsevich.lesson12;

import java.util.HashSet;
import java.util.Set;

public class Task5 {

    public void doTask() {
        Set<Integer> mySet1 = new HashSet<>(10, 0.5f);
        mySet1.add(5);
        mySet1.add(7);
        mySet1.add(3);
        mySet1.add(12);
        System.out.println("mySet1=" + mySet1);

        Set<Integer> mySet2 = new HashSet<>(10, 0.5f);
        mySet2.add(3);
        mySet2.add(8);
        mySet2.add(4);
        mySet2.add(12);
        System.out.println("mySet2=" + mySet2);

        Set<Integer> mySet3 = new HashSet<>(10, 0.5f);
        mySet3.addAll(mySet1);
        mySet3.addAll(mySet2);
        System.out.println("mySet1 united with mySet2 =" + mySet3);

        //Set<Integer> mySet4 = new HashSet<>(10, 0.5f);
        mySet1.retainAll(mySet2);
        System.out.println("mySet1 intersect with mySet2 =" + mySet1);

    }
}
