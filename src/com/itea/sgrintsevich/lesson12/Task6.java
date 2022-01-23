package com.itea.sgrintsevich.lesson12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Task6 {

    public void doTask() {

        ArrayDeque<HeavyBox> heavyBoxes = new ArrayDeque<>();
        heavyBoxes.offer(new HeavyBox(5, 6, 8, 22, "green"));
        heavyBoxes.offer(new HeavyBox(15, 3, 4, 17, "blue"));
        heavyBoxes.offer(new HeavyBox(7, 11, 2, 14, "red"));

        System.out.println("Создал очередь ArrayDeque методом offer = "+heavyBoxes);

        heavyBoxes.poll();

        System.out.println("Удалил элемент из очереди методом poll ="+heavyBoxes);

    }
}
