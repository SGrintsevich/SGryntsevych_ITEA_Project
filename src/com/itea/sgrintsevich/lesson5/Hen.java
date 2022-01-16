package com.itea.sgrintsevich.lesson5;

import java.util.Random;

public abstract class Hen {
    Random oRandom = new Random();
    public String name = "Курица";
    public static Integer Count = 0;
    public Integer henId = 0;
    //Среднее количество яиц от курицы
    public int avgEggs =20;
    //Случайный коэфициент продуктивности курицы (от 0.8 до 1.5)
    public int eggsFoo =oRandom.nextInt(70)+80;

    public Hen() {
        henId = ++Count;
        System.out.println("Создана курица ID" + henId);
    }

    public int getCountOfEggsPerMonth() {
        return 20;
    }

    public String getDescription() {
        return "Я курица. ";
    }
}
