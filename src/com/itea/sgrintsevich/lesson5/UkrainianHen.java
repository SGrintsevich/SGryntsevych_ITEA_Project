package com.itea.sgrintsevich.lesson5;


public class UkrainianHen extends Hen{
    public static Integer Count=0;
    public Integer Id=0;
    public String countrie ="Ukraine";
    public Integer avgEggs =super.avgEggs;
    public int eggsFoo =super.eggsFoo;


    public UkrainianHen(){
        Id=++Count;
        System.out.println("Создана UkrainianHen ID="+Id);
    }

    public int getCountOfEggsPerMonth(){
        Double EggsCnt= avgEggs *(1.0* eggsFoo /100.0);
        return EggsCnt.intValue();
    }

    @Override
    public String getDescription(){
        Double EggsCnt= avgEggs *(1.0* eggsFoo /100.0);
        return super.getDescription()+"Моя страна - "+this.countrie +". Я несу "+EggsCnt.intValue()+" яиц в месяц.";
    }


}
