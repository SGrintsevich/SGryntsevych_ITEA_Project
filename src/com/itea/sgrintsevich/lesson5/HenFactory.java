package com.itea.sgrintsevich.lesson5;

public class HenFactory {
    public Hen hens;
    public int num = 4;
    static int count = 0;
    String countrie;

    public HenFactory(){

    }

    //Создаю
    public Hen getHen(String countrie){
        this.countrie=countrie;
        if (this.countrie.toUpperCase().equals("UKRAINE")){
            Hen hens= new UkrainianHen();
        } else if (this.countrie.toUpperCase().equals("POLAND")){
            Hen hens= new PolishHen();
        } else if (this.countrie.toUpperCase().equals("BELARUS")){
            Hen hens= new BelarusianHen();
        } else if (this.countrie.toUpperCase().equals("MOLDOVA")){
            Hen hens= new MoldovanHen();
        } else {
            System.out.println("Error, our factory does not produce hens from "+this.countrie);
        }

        return hens;
    }


}
