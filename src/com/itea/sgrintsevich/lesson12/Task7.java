package com.itea.sgrintsevich.lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Task7 {

    public void doTask() {
        //создаю коллекцию
        Collection<HeavyBox> myCollaction1 = new ArrayList<>();
        Collection<HeavyBox> myCollaction2 = new ArrayList<>();
        Collection<HeavyBox> myCollaction3 = new ArrayList<>();

        //добавляю объекты в коллекцию
        myCollaction1.add(new HeavyBox(5, 6, 8, 122, "green"));
        myCollaction1.add(new HeavyBox(15, 3, 4, 317, "blue"));
        myCollaction1.add(new HeavyBox(7, 11, 2, 514, "red"));
        myCollaction1.add(new HeavyBox(12, 11, 7, 147, "red"));
        System.out.println(myCollaction1);

        //перебираю элементы коллекции
        for (HeavyBox heavyBox : myCollaction1) {
            if (heavyBox.weight>300 ){
                myCollaction2.add(heavyBox);
            } else {
                myCollaction3.add(heavyBox);
            }
        }
        System.out.println("Новая колекция myCollaction2 с корабками >300 грам = "+myCollaction2);
        System.out.println("Новая колекция myCollaction3 с корабками <=300 грам = "+myCollaction3);
    }
}
