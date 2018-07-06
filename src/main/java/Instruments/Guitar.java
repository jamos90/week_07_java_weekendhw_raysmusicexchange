package Instruments;

import Behaviours.IPlay;
import
import Type.Family;


public class Guitar extends MusicInstrument implements IPlay {

    public Guitar(String name, double costPrice, double sellPrice, Family family){
        super(name, costPrice, sellPrice, family);
    }

    public String play(String song){
        return "Twang twang I am playing " + song;
    }
}
