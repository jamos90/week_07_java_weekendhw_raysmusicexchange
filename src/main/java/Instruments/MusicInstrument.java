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
        this.family = family;
    }

    public String getName() {
        return this.name;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public Family getFamily() {
        return this.family;
    }
}
