package com.itea.sgrintsevich.lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Task3 {

    public void doTask() {
        //создаю коллекцию
        Collection<HeavyBox> myCollaction = new ArrayList<>();

        //добавляю объекты в коллекцию
        myCollaction.add(new HeavyBox(5, 6, 8, 12, "green"));
        myCollaction.add(new HeavyBox(15, 3, 4, 17, "blue"));
        myCollaction.add(new HeavyBox(7, 11, 2, 14, "red"));

        TreeSet ts = new TreeSet(myCollaction);

        for (Object heavyBox : ts) {
            System.out.println(heavyBox);
        }

    }
}
