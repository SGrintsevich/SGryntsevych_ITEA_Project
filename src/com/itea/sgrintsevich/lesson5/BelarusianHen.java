package com.itea.sgrintsevich.lesson5;

public class BelarusianHen extends Hen{
    public static Integer Count=0;
    public Integer id =0;
    public String countrie ="Belarus";
    public Integer avgEggs =super.avgEggs;
    public int eggsFoo =super.eggsFoo;

    public BelarusianHen(){
        id =++Count;
        System.out.println("Создана BelarusianHen ID="+ id);
    }

    public int getCountOfEggsPerMonth(){
        Double EggsCnt= avgEggs *(1.0* eggsFoo /100.0);
        return EggsCnt.intValue();
    }

    public String getDescription(){
        Double EggsCnt= avgEggs *(1.0* eggsFoo /100.0);
        return super.getDescription()+"Моя страна - "+this.countrie +". Я несу "+EggsCnt.intValue()+" яиц в месяц.";
    }
}

