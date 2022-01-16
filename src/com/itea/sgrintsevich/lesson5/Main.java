package com.itea.sgrintsevich.lesson5;

public class Main {
    public static void main(String[] args) {
        UkrainianHen uHen1 = new UkrainianHen();
        System.out.println("Курица несет "+uHen1.getCountOfEggsPerMonth()+" яиц");
        PolishHen uHen2 = new PolishHen();
        System.out.println("Курица несет "+uHen2.getCountOfEggsPerMonth()+" яиц");
        UkrainianHen uHen3 = new UkrainianHen();
        System.out.println("Курица несет "+uHen3.getCountOfEggsPerMonth()+" яиц");
        MoldovanHen uHen4 = new MoldovanHen();
        System.out.println("Курица несет "+uHen4.getCountOfEggsPerMonth()+" яиц");
        BelarusianHen uHen5 = new BelarusianHen();
        System.out.println("Курица несет "+uHen5.getCountOfEggsPerMonth()+" яиц");

        System.out.println(uHen1.getDescription());
        System.out.println(uHen2.getDescription());
        System.out.println(uHen4.getDescription());
        System.out.println(uHen5.getDescription());

        HenFactory henFactory= new HenFactory();
        Hen newHen6=henFactory.getHen("Ukraine");
        Hen newHen7=henFactory.getHen("poland");
        Hen newHen8=henFactory.getHen("USA");
    }
}
