package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Type.Family;

public class Piano extends MusicInstrument implements IPlay, ISell {
     public Piano(String name, double costPrice, double sellPrice, Family family){
         super(name,costPrice,sellPrice,family);
     }

     public String play(String song){
         return  "Plink Plonk I'm playing " + song;

     }
    public double markUp(){
        double margin = getSellPrice() - getCostPrice();
        return margin/getCostPrice();
    }
}
