package com.itea.sgrintsevich.lesson6;

public class Main {
    public static void main(String[] args) {
        BaseConverter baseConverter = new BaseConverter();
        Double convertRez = baseConverter.Convert(30.0, "F");
        System.out.println("Temperature " + baseConverter.tamprValue + " degrees by (C) corresponds to " + convertRez +
                " degrees by (" + baseConverter.convertType + ")");

        Double convertRez2 = baseConverter.Convert(30.0, "K");
        System.out.println("Temperature " + baseConverter.tamprValue + " degrees by (C) corresponds to " + convertRez2 +
                " degrees by (" + baseConverter.convertType + ")");

        Calc calc = new Calc();
        System.out.println(calc.toString());
    }
}
