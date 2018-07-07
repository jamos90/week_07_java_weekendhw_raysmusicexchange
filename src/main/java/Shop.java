import Behaviours.ISell;
import Instruments.MusicInstrument;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private ArrayList<MusicInstrument> instrumentStock;


    public Shop() {
        this.stock = new ArrayList<>();
        this.instrumentStock = new ArrayList<>();

    }

    public int stockCount() {
        return this.stock.size();
    }

    public int instrumentStockCount() {
        return this.instrumentStock.size();
    }
}