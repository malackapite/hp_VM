package hengerprogram;

import java.util.ArrayList;

public class HengerProgram {

    private ArrayList<Henger> hengerek;

    public HengerProgram() {

    }
    
    public double atlagTerfogat(){
        double sum=0;
        for (Henger henger : hengerek) {
            sum+=henger.terfogat();
        }
        return sum/hengerek.size();
    }
    
    public double csovekSulya(){
        double sum=0;
        for (Henger henger : hengerek) {
            if(henger instanceof Cso)
                sum+=((Cso) henger).suly();
        }
        return sum;
    }
    
    private ArrayList lista(){
        ArrayList<Henger> tmp = new ArrayList<>();
        tmp.add(new Henger(3,5.1));
        tmp.add(new TomorHenger(3,5.1));
        tmp.add(new TomorHenger(3,5.1,3));
        tmp.add(new Cso(10,5.2,3));
        tmp.add(new Cso(10,5.2,5, 4));
        return tmp;
    }
    
    public void run(){
        hengerek=lista();
        System.out.println("átl "+atlagTerfogat());
        System.out.println("css "+csovekSulya());
        System.out.println("hdb "+Henger.getHengerDb());
    }
    
    public static void main(String[] args) {
        new HengerProgram().run();
    }
}
