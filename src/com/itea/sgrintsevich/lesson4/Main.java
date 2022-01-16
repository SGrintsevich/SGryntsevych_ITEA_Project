package com.itea.sgrintsevich.lesson4;
import  com.itea.sgrintsevich.Lesson4.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: Создайте класс, описывающий человека");

        Human h1 = new Human("Иванов", "Иван");
        Human h2 = new Human("Петров", "Петр");
        Human h3 = new Human("Сидоров", "Сидор");

        System.out.println("(создайте метод выводящий информацию о человеке)");
        h1.SetHumanParam("Стоматолог",33);
        h1.PrinHumanDesc();
        h2.SetHumanParam("Таксист",42);
        h2.PrinHumanDesc();
        h3.SetHumanParam("Школота",9);
        h3.PrinHumanDesc();

        System.out.println("");
        System.out.println("На его основе создайте класс студент с полями (айди, имя, фамилия, факультет, рейтинг(средний бал), год поступления) (переопределите метод вывода информации).");
        Student s1=new Student("Студентов", "Студент",4.3);
        s1.SetHumanParam("Студент",19);
        s1.SetStudentParam("Финансы", "ФБ-22", 2020,4.9);
        s1.PrinHumanDesc();

        System.out.println("Создайте класс “группа” который содержит массив из 10 объектов класса студент. ");

        Group gr1=new Group("ФБ-22","Финансы", 2020);
        gr1.GroupInfo();
        Student[] s=new Student[10];
        s[0]=new Student("Иванов", "Иван",4.5);
        s[1]=new Student("Петров", "Петр",3.7);
        s[2]=new Student("Сидоров", "Николай",4.7);
        s[7]=new Student("Костюк", "Марина",3.3);
        s[4]=new Student("Карпенко", "Лариса",4.0);
        s[5]=new Student("Суслов", "Степан",4.3);
        s[6]=new Student("Резник", "Руслан",4.3);
        s[3]=new Student("Литвин", "Демян",3.3);
        s[8]=new Student("Литвин", "Иван",2.9);
        s[9]=new Student("Карасев", "Алибаба",4.8);

        System.out.println("Реализуйте метод добавления");
        for(int i = 0; i < 10; i++){
            gr1.AddStudent(s[i]);
        }
        System.out.println("");
        System.out.println("Реализуйте методы удаления");
        gr1.DelStudent(s[0]);
        gr1.DelStudent(s[3]);
        System.out.println("");

        System.out.println("метод поиска студента по фамилии");
        System.out.println(gr1.LookUpStudent("Карпенко"));
        System.out.println(gr1.LookUpStudent("Карпенкова"));
        System.out.println("");

        System.out.println("Определите метод toString() для класса студент чтобы он выводил имя і фамилию и средний бал");
        System.out.println(gr1.students[6].toString());

        System.out.println("");
        System.out.println("Определите метод toString() для группы так, чтобы он выводил список студентов в алфавитном порядке.");
        gr1.toString();
    }
}
