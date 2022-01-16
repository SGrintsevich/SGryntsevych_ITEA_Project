package com.itea.sgrintsevich.lesson2;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Lesson2_Task7 {
    public static void main(String[] args) {
        System.out.println("Что это есть такое: синий, большой, с усами и полный зайцев?");
        System.out.println("Введите ответ:");
        Scanner oScanner = new Scanner(System.in);

        for (int j = 1; j < 4; j++) {
            String mAnswer = toUpperCase(oScanner.next());
            if (mAnswer.equals("ТРОЛЕЙБУС")) {
                System.out.println("Правильно!");
                break;
            } else if (mAnswer.equals("СДАЮСЬ")) {
                System.out.println("Правильный ответ: \"Троллейбус\"");
                break;
            } else {
                if (j<3){
                    System.out.println("Подумайте еще");
                    continue;
                } else {
                    System.out.println("THE END");
                }
            }
        }
    }
}
