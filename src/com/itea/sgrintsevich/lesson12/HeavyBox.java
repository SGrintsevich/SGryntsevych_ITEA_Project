package com.itea.sgrintsevich.lesson12;

public class HeavyBox implements Comparable<HeavyBox> {
    Integer length;
    Integer width;
    Integer height;
    String collor;
    Integer weight;

    public HeavyBox(Integer length, Integer width, Integer height, Integer weight, String collor) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.collor = collor;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    //Сравнение коробок по весу
    @Override
    public int compareTo(HeavyBox hb) {
        int Value=hb.weight-this.weight;
        return Value;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", collor='" + collor + '\'' +
                '}';
    }
}
