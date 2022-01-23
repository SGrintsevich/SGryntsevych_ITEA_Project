package com.itea.sgrintsevich.lesson12;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Task2 {

    public void doTask() {
        //создаю коллекцию
        Collection<HeavyBox> myCollaction = new ArrayList<>();

        //добавляю объекты в коллекцию
        myCollaction.add(new HeavyBox(5, 6, 8, 22, "green"));
        myCollaction.add(new HeavyBox(15, 3, 4, 17, "blue"));
        myCollaction.add(new HeavyBox(7, 11, 2, 14, "red"));

        //создаю итератор для прохода по коллекции
        Iterator<HeavyBox> myIterator = myCollaction.iterator();
        System.out.println("\nВывожу элементы колекции с использованием Iterator");
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }

        System.out.println("\nВывожу элементы колекции с использованием Foreach");
        //перебираю элементы коллекции и вывожу их в консоль
        for (HeavyBox heavyBox : myCollaction) {
            System.out.println(heavyBox);
        }

        System.out.println("\nВывожу элементы колекции с использованием перебора For");
        //перебираю элементы коллекции и вывожу их в консоль
        for (int i = 0; i < myCollaction.size() - 1; i++) {
            System.out.println(((ArrayList<HeavyBox>) myCollaction).get(i));
        }

    }
}
