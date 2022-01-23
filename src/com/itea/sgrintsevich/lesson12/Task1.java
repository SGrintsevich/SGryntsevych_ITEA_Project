package com.itea.sgrintsevich.lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Task1 {

    public void doTask() {
        //создаю коллекцию
        Collection<HeavyBox> myCollaction = new ArrayList<>();

        //добавляю объекты в коллекцию
        myCollaction.add(new HeavyBox(5,6,8,22,"green"));
        myCollaction.add(new HeavyBox(15,3,4,17,"blue"));
        myCollaction.add(new HeavyBox(7,11,2,14,"red"));

        //создаю итератор для прохода по коллекции
        Iterator<HeavyBox> myIterator = myCollaction.iterator();
        //перебираю элементы коллекции и вывожу их в консоль
        for (HeavyBox heavyBox: myCollaction) {
            System.out.println(heavyBox);
        }

        System.out.println("В масиве элементов = "+myCollaction.size()+";\n");

        //Получаю первый элемент масива
        HeavyBox b1 = ((ArrayList<HeavyBox>) myCollaction).get(0);
        //Меняю вес коробки
        b1.weight= b1.weight+1;
        //Заменяю первый элемент масива новым объектом
        ((ArrayList<HeavyBox>) myCollaction).set(0,b1);
        //Удаляю последний элемент масива
        ((ArrayList<HeavyBox>) myCollaction).remove(myCollaction.size()-1);
        System.out.println("В масиве элементов = "+myCollaction.size()+";\n");

        //перебираю элементы коллекции и вывожу их в консоль
        for (HeavyBox heavyBox: myCollaction) {
            System.out.println(heavyBox);
        }

        //Очищаю масива
        ((ArrayList<HeavyBox>) myCollaction).clear();
        System.out.println("\nВ масиве элементов = "+myCollaction.size()+";\n");
    }
}
