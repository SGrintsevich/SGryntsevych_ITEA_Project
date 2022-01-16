package com.itea.sgrintsevich.lesson2;

import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {
        int i = 0;
        String mCharRez = "";
        System.out.println("Вывожу 1...5");
        while (i < 5) {
            i += 1;
            mCharRez = mCharRez + i + " ";
        }
        System.out.println(mCharRez);
        System.out.println("");

        mCharRez = "";
        System.out.println("Вывожу 5...1");
        while (i > 0) {
            mCharRez = mCharRez + i + " ";
            i -= 1;
        }

        System.out.println(mCharRez);
        System.out.println("");

        int multiplier = 3;
        System.out.println("Вывожу таблицу умножения на " + multiplier);
        for (int j = 0; j <= 10; j++) {
            System.out.println(multiplier + " x " + j + " = " + multiplier * j);
        }
        System.out.println("");

        System.out.println("Вывожу сумму последовательного набора чисел");
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        Integer mIntRez = 0;

        for (int j = 0; j <= Integer.parseInt(answer); j++) {
            //System.out.println(j);
            mIntRez = mIntRez + j;
        }

        System.out.println(mIntRez);
        System.out.println("");

        System.out.println("Арифметическая прогресия для числа 7");
        mCharRez="";
        i = 0;
        while (i < 98) {
            i=i+7;
            mCharRez=mCharRez+i+" ";
        }
        System.out.println(mCharRez);
        System.out.println("");

        System.out.println("Геометрическая прогресия для числа 2");
        mCharRez="";
        i = 1;
        while (i <= 512) {
            mCharRez=mCharRez+i+" ";
            i=i*2;
        }
        System.out.println(mCharRez);
        System.out.println("");

    }
}
