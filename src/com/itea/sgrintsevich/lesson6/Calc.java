package com.itea.sgrintsevich.lesson6;

import java.util.Scanner;

public class Calc {
    static Scanner scanner = new Scanner(System.in);
    Double Num1 = getNum();
    String mathOper = getMathOper();
    Double Num2 = getNum();
    Double calcRez = getCalcRez();

    //Читаю значения с клавиатуры, определяю числовые значения для операций
    public Double getNum() {
        System.out.println("Input numeric value:");
        Double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Incorrect input for number format, try again!");
            scanner.next();
            num = getNum();
        }
        return num;
    }

    //Читаю символ операции
    public String getMathOper() {
        System.out.println("Input math operator (+,-,*,/):");
        String mathOper;
        scanner.hasNext();
        mathOper = scanner.next();
        if (mathOper.equals("+") || mathOper.equals("-") || mathOper.equals("*") || mathOper.equals("/")) {
            return mathOper;
        } else {
            System.out.println("Incorrect math operator (+,-,*,/), try again!");
            scanner.next();
            mathOper = getMathOper();
        }
        return mathOper;
    }

    //Выполняю расчет
    public double getCalcRez() {
        switch (this.mathOper) {
            case "+":
                calcRez = this.Num1 + this.Num2;
                break;
            case "-":
                calcRez = this.Num1 - this.Num2;
                break;
            case "*":
                calcRez = this.Num1 * this.Num2;
                break;
            case "/":
                if (this.Num2 != 0.0) {
                    calcRez = this.Num1 / this.Num2;
                    break;
                } else {
                    System.out.println("Error, division by zero!");
                    calcRez = 0.0;
                    break;
                }
        }
        return calcRez;
    }

    //Переопределяю метод toString для вывода результатов
    @Override
    public String toString() {
        return this.Num1 + " " + this.mathOper + " " + this.Num2 + " = " + this.calcRez;
    }


}
