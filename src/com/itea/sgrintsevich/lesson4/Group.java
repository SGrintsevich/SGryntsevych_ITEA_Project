package com.itea.sgrintsevich.lesson4;

import java.util.Arrays;


public class Group {
    public String GroupName;
    public String Faculty;
    public Integer StartYear;
    public int num = 10;
    public Student[] students;
    static int count = 0;

    public Group(String pGroupName, String pFaculty, Integer pStartYear) {
        this.GroupName = pGroupName;
        this.Faculty = pFaculty;
        this.StartYear = pStartYear;
        students = new Student[num];
    }

    public boolean AddStudent(Student student) {
        if (this.count >= num) {
            return false;
        }
        this.students[count] = student;
        this.students[count].Group = this.GroupName;
        this.students[count].Year = this.StartYear;
        this.count = this.count + 1;
        System.out.println("        Добавлен студента ID=" + student.StudentId +
                "  LastName=" + student.LastName + "  Grade=" + student.Grade);
        return true;
    }

    public boolean DelStudent(Student student) {
        System.out.println("        Получил на удаление студента ID=" + student.StudentId + "  LastName=" +
                student.LastName);
        return true;
    }

    public void GroupInfo() {
        System.out.println("        Группа " + this.GroupName + " факультет " + this.Faculty + "\n");
    }

    public String LookUpStudent(String LastName) {
        int i;
        for (i = 0; i < this.num; i++) {
            if (this.students[i].LastName.equals(LastName)) {
                return "        Найден студент StudentId=" + this.students[i].StudentId + " " + LastName +
                        " " + this.students[i].Name;
            }
        }
        return "        Не найден студент " + LastName;
    }

    @Override
    public String toString(){
        String[] tmpStodents=new String[this.num];
        int i;
        for (i=0; i<this.num; i++){
            tmpStodents[i]=this.students[i].LastName+" "+this.students[i].Name;
        }
        Arrays.sort(tmpStodents);
        for (i=0; i<this.num; i++){
            System.out.println("        "+tmpStodents[i]);
        }
        return "";
    }


}
