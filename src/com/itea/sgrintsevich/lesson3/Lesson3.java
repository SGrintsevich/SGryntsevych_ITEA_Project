package com.itea.sgrintsevich.lesson3;

public class Lesson3 {

        public static void main(String[] args) {
            //Задание 1
            String mStr1 = "123ACA321";
            String mStr2 = "";
            String mStr3 = "";

            if (ArrPalindromCheck(mStr1.toUpperCase()) == 1) {
                System.out.println("Your string: " + TxtYELLOW + mStr1 + TxtBLUE + " is a palindrome:" + TxtRESET);
            } else {
                System.out.println("Your string: " + TxtYELLOW + mStr1 + TxtRED + " is not palindrome:" + TxtRESET);
            }
            System.out.println("");

            //Задание 2
            mStr1 = "PHP Exercises and ";
            mStr2 = "Python Exercises";
            System.out.println("The concatenated string: " + TxtYELLOW + mStr1 + mStr2 + TxtRESET);
            System.out.println("");

            //Задание 3
            mStr1 = "This is exercise 1";
            mStr2 = "This is Exercise 1  ";

            if (mStr1.trim().toUpperCase().equals(mStr2.trim().toUpperCase())) {
                System.out.println(TxtYELLOW + "\"" + mStr1 + "\"" + TxtRESET + " is equal to " + TxtYELLOW + "\"" + mStr2 + TxtRESET + "\"");
            } else {
                System.out.println(TxtYELLOW + "\"" + mStr1 + "\"" + TxtRESET + " is not equal to " + TxtYELLOW + "\"" + mStr2 + TxtRESET + "\"");
            }
            System.out.println("");

            //Задание 4
            Integer i = 0;
            mStr1 = "test string";
            mStr2 = "";

            mStr1 = mStr1.replace(" ", "");

            while (i < mStr1.length()) {
                if (i % 2 == 0) {
                    mStr2 = mStr2 + mStr1.charAt(i);
                }
                i += 1;
            }
            System.out.println("The given string is: " + TxtYELLOW + mStr1 + TxtRESET);
            System.out.println("The new string is: " + TxtYELLOW + mStr2 + TxtRESET);
            System.out.println("");

            //Задание 5
            i = 0;
            Integer i1 = 0;
            Integer i2 = 0;
            mStr1 = "rabbit bribe dog bit";
            mStr2 = "bib";

            String[] myArr1 = mStr1.split(" ");
            char[] myArr2 = mStr2.toCharArray();

            System.out.println("The given strings are: "+TxtYELLOW+mStr1+TxtRESET);
            System.out.println("The given word is: "+TxtYELLOW+mStr2+TxtRESET);

            System.out.println("The strings containing all the letters of the given word are:");

            while (i < myArr1.length) {
                while (i1 < myArr2.length) {
                    if (myArr1[i].contains(""+myArr2[i1])){
                        i2=i2+1;
                    } else {
                        i2=i2+999;
                    }
                    i1 += 1;
                }
                i1 = 0;
                if (i2==myArr2.length){
                    System.out.println(TxtYELLOW+myArr1[i]+TxtRESET);
                }
                i2=0;
                i += 1;

            }
            System.out.println(mStr3);

        }


        //метод ArrPalindromCheck выполняет проверку текста на полиндром
        public static Integer ArrPalindromCheck(String mStr1) {
            Integer i = 0;
            char[] myArr1 = mStr1.toCharArray();

            while (i < myArr1.length / 2) {
                if (myArr1[i] != myArr1[myArr1.length - i - 1]) {
                    return 2;
                }
                i += 1;
            }
            return 1;
        }

        public static final String TxtGREEN = "\u001B[32m";
        public static final String TxtYELLOW = "\u001B[33m";
        public static final String TxtRED = "\u001B[31m";
        public static final String TxtBLUE = "\u001B[34m";
        public static final String TxtRESET = "\u001B[0m";
    }


