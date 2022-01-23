package com.itea.sgrintsevich.lesson12;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    String str;

    public void doTask(String str) {
        Set<Integer> mySet = new HashSet<>(10, 0.5f);
        String[] strArr = str.split(",");

        for (String str1: strArr){
            mySet.add(Integer.parseInt(str1.trim()));
        }

        System.out.println(mySet);
    }
}
