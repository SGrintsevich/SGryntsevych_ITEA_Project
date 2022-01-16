package com.itea.sgrintsevich.lesson4;

public class Student extends com.itea.sgrintsevich.Lesson4.Human {
    public String Faculty;
    public String Group;
    public Integer Year;
    public Double Grade;
    public static Integer Count=0;
    public Integer StudentId = 0;

    public Student(String LastName, String Name, Double Grade) {
        super(LastName, Name);
        this.Grade=Grade;
        StudentId = ++Count;
    }

    public void SetStudentParam(String pFaculty, String pGroup, Integer pYear, Double pGrade){
        this.Faculty=pFaculty;
        this.Group=pGroup;
        this.Year=pYear;
        this.Grade=pGrade;
    }

    @Override
    public void PrinHumanDesc(){
        System.out.println("        Студент №"+StudentId+" "+LastName+" "+Name+" поступил в "+Year+" году, факультет "+Faculty+" группа "+Group+"\n");
    }

    @Override
    public String toString(){
        return "        Студент "+this.LastName+" "+this.Name+", рейтинг - "+this.Grade;
    }


}

