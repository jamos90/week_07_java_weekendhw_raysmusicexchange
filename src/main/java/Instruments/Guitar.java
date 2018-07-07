package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Type.Family;



public class Guitar extends MusicInstrument implements IPlay, ISell {


    public Guitar(String name, double costPrice, double sellPrice, Family family){
        super(name, costPrice, sellPrice, family);
    }

    public String play(String song){
        return "Twang twang I am playing " + song;
    }

    public double markUp(){
         double margin = getSellPrice() - getCostPrice();
         return margin/getCostPrice();
    }
}
