package com.itea.sgrintsevich.lesson12;

import java.util.*;

import static com.itea.sgrintsevich.lesson3.Lesson3.TxtGREEN;
import static com.itea.sgrintsevich.lesson3.Lesson3.TxtRESET;


public class Main {
    public static void main(String[] args) {
        System.out.println(TxtGREEN + "Выполняю задание 1" + TxtRESET);
        Task1 task1 = new Task1();
        task1.doTask();

        System.out.println("\n\n\n" + TxtGREEN + "Выполняю задание 2" + TxtRESET);
        Task2 task2 = new Task2();
        task2.doTask();

        System.out.println("\n\n\n" + TxtGREEN + "Выполняю задание 3" + TxtRESET);
        Task3 task3 = new Task3();
        task3.doTask();

        System.out.println("\n\n\n" + TxtGREEN + "Выполняю задание 4" + TxtRESET);
        Task4 task4 = new Task4();
        task4.doTask("12,2,3,3,2,4,5,7,6,1,8,8,8,9");

        System.out.println("\n\n\n" + TxtGREEN + "Выполняю задание 5" + TxtRESET);
        Task5 task5 = new Task5();
        task5.doTask();

        System.out.println("\n\n\n" + TxtGREEN + "Выполняю задание 6" + TxtRESET);
        Task6 task6 = new Task6();
        task6.doTask();

        System.out.println("\n\n\n" + TxtGREEN + "Выполняю задание 7" + TxtRESET);
        Task7 task7 = new Task7();
        task7.doTask();

        System.out.println("\n\n\n" + TxtGREEN + "Выполняю задание 8" + TxtRESET);
        Task8 task8 = new Task8();
        task8.doTask();

        System.out.println("\n\n\n" + TxtGREEN + "Выполняю задание 11" + TxtRESET);
        Task11 task11 = new Task11();
        task11.doTask("Cost", "Asc");
    }

}

class ProductNameComparator implements Comparator<Product> {
    String orderType;

    public ProductNameComparator(String orderType) {
        this.orderType = orderType;
    }

    public int compare(Product p1, Product p2) {
        if (this.orderType == "Asc") {
            return p2.name.compareTo(p1.name);
        } else {
            return p1.name.compareTo(p2.name);
        }

    }
}

class ProductCostComparator implements Comparator<Product> {
    String orderType;

    public ProductCostComparator(String orderType) {
        this.orderType = orderType;
    }

    public int compare(Product p1, Product p2) {
        if (this.orderType == "Desc") {
            if (p1.cost == p2.cost) {
                return 0;
            } else if (p1.cost > p2.cost) {
                return -1;
            } else {
                return 1;
            }
        } else {
            if (p2.cost == p1.cost) {
                return 0;
            } else if (p2.cost > p1.cost) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

class ProductRatingComparator implements Comparator<Product> {
    String orderType;

    public ProductRatingComparator(String orderType) {
        this.orderType = orderType;
    }

    public int compare(Product p1, Product p2) {
            if (p1.rating == p2.rating) {
                return 0;
            } else if (this.orderType=="Asc" && p1.rating < p2.rating) {
                return -1;
            } else if (this.orderType=="Asc" && p1.rating > p2.rating) {
                return 1;
            } else if (this.orderType=="Desc" && p1.rating > p2.rating) {
                return -1;
            } else {
                return 1;
            }
    }
}
