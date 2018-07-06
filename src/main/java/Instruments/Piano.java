package Instruments;

import Behaviours.IPlay;
import Type.Family;

public class Piano extends MusicInstrument implements IPlay{
     public Piano(String name, double costPrice, double sellPrice, Family family){
         super(name,costPrice,sellPrice,family);
     }

     public String play(String song){
         return  "Plink Plonk I'm playing " + song;

     }
}
