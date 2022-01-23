package com.itea.sgrintsevich.lesson12;

import java.util.Comparator;

public class Product {
    String name;
    String type;
    Float cost;
    Float rating;

    public Product(String name, String type, Float cost, Float rating) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Float getCost() {
        return cost;
    }

    public Float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cost='" + cost + '\'' +
                ", rating=" + rating +
                '}';
    }
}


