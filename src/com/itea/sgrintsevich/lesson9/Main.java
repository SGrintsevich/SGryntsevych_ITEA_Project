package com.itea.sgrintsevich.lesson9;

public class Main {
    public static void main(String[] args) {
        WeekDay wd;
        wd = WeekDay.valueOf("MONDAY");
        System.out.println(wd + ": isHoliDay = " + wd.isHoliDay());
        System.out.println(wd + ": isWeekDay = " + wd.isWeekDay());
        System.out.println(wd + ": dayType = " + wd.dayType() + "\n");

        wd = WeekDay.valueOf("SUNDAY");
        System.out.println(wd + ": isHoliDay = " + wd.isHoliDay());
        System.out.println(wd + ": isWeekDay = " + wd.isWeekDay());
        System.out.println(wd + ": dayType = " + wd.dayType() + "\n");

        WeekDay[] wd2 = WeekDay.values();
        for (WeekDay element : wd2) {
            System.out.println(element+": isWeekDay="+WeekDay.valueOf(element.toString()).isWeekDay());
        }
    }
}
