package com.itea.sgrintsevich.lesson12;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task8 {

    public void doTask() {
        Map<String, Product> myMap = new HashMap<>();
        myMap.put("Петрушка", new Product("Петрушка", "Кукла", 150f, 3.2f));
        myMap.put("Грузовик ЗИЛ", new Product("Грузовик ЗИЛ", "Машина", 137.2f,4.7f));
        myMap.put("Красная Ферари", new Product("Красная Ферари", "Машина", 270f, 4.6f));
        myMap.put("Lego Technic", new Product("Lego Technic", "Конструктор", 250f, 2.8f));

        System.out.println("\nПеребираю и вывожу пары значений entrySet");
        Set<Map.Entry<String, Product>> entries = myMap.entrySet();
        for (Map.Entry<String, Product> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("\nПеребираю и вывожу набор из имен продуктов");
        Set<String> keys = myMap.keySet();
        for (String key: keys){
            System.out.println("Product: "+key);
        }

        System.out.println("\nПеребираю и вывожу значения Value");
        Set<Map.Entry<String, Product>> entries2 = myMap.entrySet();
        for (Map.Entry<String, Product> entry : entries2) {
            System.out.println(entry.getValue());
        }
        //System.out.println(myMap);
    }

}
