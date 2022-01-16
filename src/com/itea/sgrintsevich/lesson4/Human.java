package com.itea.sgrintsevich.Lesson4;

public class Human {
    public String LastName;
    public String Name;
    public Double Age;
    public String Job;

    public static Integer Count=0;
    private Integer Id = 0;

    public Human(String LastName, String Name) {
        this.Name=Name;
        this.LastName=LastName;
        Id = ++Count;
    }

    public void PrinHumanDesc(){
        System.out.println("        Это "+LastName+" "+Name+" ему "+Age+" года, он "+Job);
    }

    public void SetHumanParam(String pJob, double pAge) {
        Job = pJob;
        Age = pAge;
    }


}



