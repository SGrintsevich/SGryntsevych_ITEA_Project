package com.itea.sgrintsevich.lesson2;

import java.util.Random;

public class Lesson2_Arreys {
    public static void main(String[] args) {

        Random oRandom = new Random();
        Integer[] mArr1 = new Integer[8];
        int i = 0;

        System.out.println("Формирую масив из 8 случайных целых");

        NewIntArr(mArr1, 10);
        System.out.println(IntArrToString(mArr1));

        i = 0;

        System.out.println("");
        System.out.println("Заменяю на 0 для элементов с непарным индексом ");
        while (i < mArr1.length) {
            if (i % 2 == 0 & i != 0) {
                mArr1[i] = 0;
            }
            i += 1;
        }

        System.out.println(IntArrToString(mArr1));

        Integer[] mArr2 = new Integer[12];
        i = 0;
        Integer mMax = -15, mMaxIdx = 0;

        System.out.println("");
        System.out.println("Формирую масив из 12 случайных целых в диапазоне -15...15");

        while (i < mArr2.length) {
            mArr2[i] = oRandom.nextInt(30) - 15;

            if (mArr2[i] > mMax) {
                mMax = mArr2[i];
                mMaxIdx = i;
            }
            i += 1;
        }

        System.out.println(IntArrToString(mArr2));
        System.out.println("Max значение=" + mMax + "   последнее вхождение в массив=" + mMaxIdx);

        Integer[] mArr3 = new Integer[4];
        i = 0;
        int mFlag = 1;

        System.out.println("");
        System.out.println("Формирую масив из 4 случайных целых в диапазоне 10...99");
        while (i < mArr3.length) {
            mArr3[i] = oRandom.nextInt(89) + 10;

            if (i == 0) {     //первый элемент не с чем сравнивать
                mFlag = 1;
            } else if (i > 0 & mFlag == 1 & mArr3[i - 1] <= mArr3[i]) { //сравниваем предидущий элемент с текущим
                mFlag = 1;  //все ОК предидущий элемент меньше текущего, сохраняем флаг в статусе 1
            } else {
                mFlag = 2;  //условие не выполнилось, меняем флаг
            }
            i += 1;
        }

        System.out.println(IntArrToString(mArr3));
        System.out.println(mFlag == 1 ? "Массив c строго растущей последовательностью" : "Массив без строго растущей последовательности");

        System.out.println("");
        System.out.println("Выполняю сортировку String масива в обратном порядке");

        String[] mArr4 = {"Марина", "Вика", "Жана", "Оля", "Аня", "Катя"};

        System.out.println(StrArrToString(mArr4));
        StrArrOrder(mArr4);
        System.out.println(StrArrToString(mArr4));

        System.out.println("");

        Integer[] mArr5 = new Integer[5];
        NewIntArr(mArr5, 5);

        Integer[] mArr6 = new Integer[5];
        NewIntArr(mArr6, 5);

        System.out.println(IntArrToString(mArr5));
        System.out.println(IntArrToString(mArr6));

        double avg1 = AvgIntArr(mArr5);
        double avg2 = AvgIntArr(mArr6);

        if (avg1 == avg2) {
            System.out.println("Средние арифметические масивов равны: " + avg1 + "=" + avg2);
        } else if (avg1 > avg2) {
            System.out.println("Средние арифметические первого масива больше: " + avg1 + ">" + avg2);
        } else {
            System.out.println("Средние арифметические второго масива больше: " + avg2 + ">" + avg1);
        }

    }

    public static String IntArrToString(Integer[] myStrArr) {
        String mRez = "";
        Integer i = 0;
        while (i < myStrArr.length) {
            mRez = mRez + myStrArr[i] + "; ";
            i += 1;
        }
        return mRez;
    }

    public static String StrArrToString(String[] myStrArr) {
        String mRez = "";
        Integer i = 0;
        while (i < myStrArr.length) {
            mRez = mRez + myStrArr[i] + "; ";
            i += 1;
        }
        return mRez;
    }

    public static void StrArrOrder(String[] myStrArr) {
        Integer i = 0;
        Integer ii = 0;
        String mStr1 = "";

        while (i < myStrArr.length / 2) {
            mStr1 = myStrArr[i];  //Запоминаю текущую позицию в масиве
            myStrArr[i] = myStrArr[myStrArr.length - i - 1]; //переношу значение из последнего элемента в первый
            myStrArr[myStrArr.length - i - 1] = mStr1; //меняю значение последнего элемента
            i += 1;
        }
    }


    public static void NewIntArr(Integer[] myArr, Integer bound) {
        Integer i = 0;
        Random oRandom = new Random();

        while (i < myArr.length) {
            myArr[i] = oRandom.nextInt(bound);
            i += 1;
        }
        //return mRez;
    }

    public static double AvgIntArr(Integer[] myArr) {
        Integer i = 0;
        double rez = 0.0;

        while (i < myArr.length) {  //Считаю сумму всех элементов
            rez = rez + myArr[i];
            i += 1;
        }
        return rez / myArr.length;
    }
}
