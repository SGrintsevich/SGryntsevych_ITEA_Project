package com.itea.sgrintsevich.lesson12;

import java.util.ArrayList;
import java.util.Collections;

public class Task11 {

    public void doTask(String orderBy,String orderMethod) {
        ArrayList<Product> myProduct = new ArrayList<Product>();

        myProduct.add(new Product("Петрушка", "Кукла", 150f, 3.2f));
        myProduct.add(new Product("Грузовик ЗИЛ", "Машина", 137.2f,4.7f));
        myProduct.add(new Product("Красная Ферари", "Машина", 270f, 4.6f));
        myProduct.add(new Product("Lego Technic", "Конструктор", 250f, 2.8f));

        for (Product product: myProduct){
            System.out.println(product.name+"; "+product.cost+"; "+product.rating);
        }

        System.out.println("\n\n\nСортирую по имени по возрастанию");
        Collections.sort(myProduct, new ProductNameComparator("Asc"));
        for (Product product: myProduct){
            System.out.println(product.name+"; "+product.cost+"; "+product.rating);
        }

        System.out.println("\n\n\nСортирую цену по возрастанию");
        Collections.sort(myProduct, new ProductCostComparator("Asc"));
        for (Product product: myProduct){
            System.out.println(product.name+"; "+product.cost+"; "+product.rating);
        }

        System.out.println("\n\n\nСортирую цену по убыванию");
        Collections.sort(myProduct, new ProductCostComparator("Desc"));
        for (Product product: myProduct){
            System.out.println(product.name+"; "+product.cost+"; "+product.rating);
        }

        System.out.println("\n\n\nСортирую по рейтингу");
        Collections.sort(myProduct, new ProductRatingComparator("Asc"));
        for (Product product: myProduct){
            System.out.println(product.name+"; "+product.cost+"; "+product.rating);
        }
    }


}

