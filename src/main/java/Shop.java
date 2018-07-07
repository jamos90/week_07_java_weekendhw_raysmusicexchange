import Behaviours.IPlay;
import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.MusicInstrument;


import javax.sound.midi.MidiChannel;
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

    public int intsrumentStockCount(){
        return this.instrumentStock.size();
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

    public void sell(ISell item){
        if (this.stock.contains(item)){
            this.stock.remove(item);
        }
    }

    public void sellInstrument(MusicInstrument instrument){
        if (this.instrumentStock.contains(instrument)){
            this.stock.remove(instrument);
            this.till += instrument.getSellPrice();
        }
    }

    public void addToInstruments(MusicInstrument instrument) {
        this.instrumentStock.add(instrument);
    }

    public double totalSellPrice(){
        double totalSales = 0;
                for (MusicInstrument item : this.instrumentStock) { totalSales += item.getSellPrice();
                }
                return totalSales;
    }

}