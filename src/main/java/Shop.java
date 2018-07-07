import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.MusicInstrument;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private ArrayList<MusicInstrument> instrumentStock;
    private double till;


    public Shop(double till) {
        this.stock = new ArrayList<>();
        this.instrumentStock = new ArrayList<>();
        this.till = till;

    }

    public int stockCount() {
        return this.stock.size();
    }

    public int instrumentStockCount() {
        return this.instrumentStock.size();
    }

    public double getTill() {
        return this.till;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void addToInstruments(MusicInstrument instrument) {
        this.instrumentStock.add(instrument);
    }
}