package com.itea.sgrintsevich.lesson16;

import com.itea.sgrintsevich.lesson12.HeavyBox;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void Task1() {
        //Создать и заполнить файл случайными числами
        Random random = new Random();
        int i = 0;
        Integer rand = 0;

        try (FileOutputStream fos = new FileOutputStream(".//out//MyArray.txt")) {
            while (i < 20) {
                rand = random.nextInt(100);
                byte[] buffer = rand.toString().concat("\n").getBytes();
                fos.write(buffer, 0, buffer.length);
                i += 1;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Отсортировать содержимое файла по возростанию
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        try {
            File file = new File(".//out//MyArray.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                myArrayList.add(Integer.parseInt(line));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Collections.sort(myArrayList);
        System.out.print(myArrayList.toString());
    }

    public static void Task2() {
        //Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.
        try {
            File file = new File(".//src/com/itea/sgrintsevich/lesson12/Main.java");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            FileOutputStream fos = new FileOutputStream(".//out//Main_whith_replace.java");

            while (line != null) {

                byte[] buffer = line.replace("public", "private").concat("\n").getBytes();
                fos.write(buffer, 0, buffer.length);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void Task3() {
        //Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.
        try {
            File file = new File(".//src/com/itea/sgrintsevich/lesson12/Main.java");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            FileOutputStream fos = new FileOutputStream(".//out//Main_whith_reverse.java");

            while (line != null) {
                String reverse = new StringBuffer(line).reverse().toString();
                byte[] buffer = reverse.concat("\n").getBytes();
                fos.write(buffer, 0, buffer.length);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void Task4() {
        //Прочитать текст Java-программы и в каждом слове длиннее двух символов все строчные символы заменить прописными.
        try {
            File file = new File(".//src/com/itea/sgrintsevich/lesson12/Main.java");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            String strMod="";

            FileOutputStream fos = new FileOutputStream(".//out//Main_whith_uppercase.java");

            while (line != null) {
                for (String splitWord : line.split(" ", 0)) {
                    if (splitWord.length()>2) {
                        strMod = strMod.replace(splitWord, splitWord.toUpperCase());
                    }
                }
                System.out.println(strMod);
                byte[] buffer = strMod.concat("\n").getBytes();
                fos.write(buffer, 0, buffer.length);
                line = reader.readLine();
                strMod=line;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
    }

}
