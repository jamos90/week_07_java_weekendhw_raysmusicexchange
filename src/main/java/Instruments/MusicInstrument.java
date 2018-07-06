package Instruments;

import Type.Family;

public abstract class MusicInstrument {
    private String name;
    private double costPrice;
    private double sellPrice;
    private Family family;

    public MusicInstrument(String name, double costPrice, double sellPrice, Family family){
        this.name = name;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return this.name;
    }
}
