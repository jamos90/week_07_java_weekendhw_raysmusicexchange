import Behaviours.IPlay;
import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.MusicInstrument;
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

    public void sell(ISell item) {
        if (this.stock.contains(item)) {
            this.stock.remove(item);
        }
    }

    public boolean instrumentExists(MusicInstrument instrument){
        if (this.instrumentStock.contains(instrument)){
        return  true; }
        else
            return false;
    }

//    public void sellInstrument(MusicInstrument instrument, Customer customer) {
//        if (this.instrumentStock.contains(instrument) && (customer.getWallet() >= instrument.getSellPrice())) {
//            this.stock.remove(instrument);
//            this.till += instrument.getSellPrice();
//            customer.buy(instrument.getSellPrice());
//
//        }
//    }

    //check which one is best to use.

    public void sellInstrument(MusicInstrument instrument, Customer customer) {
        if (customer.getWallet() < instrument.getSellPrice()){
            return;
        }
        if (this.instrumentStock.contains(instrument)){
            this.stock.remove(instrument);
            this.till += instrument.getSellPrice();
            customer.buy(instrument.getSellPrice());
            customer.addToInstrumentCollection(instrument);

        }
    }

    public void addToInstruments(MusicInstrument instrument) {
        this.instrumentStock.add(instrument);
    }

    public double totalSellPriceItems() {
        double totalSlaes = 0;
        for (ISell item : this.stock) {
            totalSlaes += item.totalSellPrice();
        }
        return totalSlaes;
    }

    public double totalSellPriceInstruments() {
        double totalSales = 0;
        for (MusicInstrument item : this.instrumentStock) {
            totalSales += item.getSellPrice();
        }
        return totalSales;
    }

    public boolean customerInstrumentValue(MusicInstrument shopInstrument, MusicInstrument customerInstrumnet){
        if (customerInstrumnet.getSellPrice() > shopInstrument.getSellPrice());
        return true;
    }

    public boolean stockContainsInstrument(MusicInstrument shopInstrument, MusicInstrument customerInstrument){
        if (instrumentStock.contains(shopInstrument) && !instrumentStock.contains(customerInstrument));
        return  true;
    }

    public void canTradeInstrument(MusicInstrument shopInstrument, MusicInstrument customerInstrument){
        if (stockContainsInstrument(shopInstrument,customerInstrument) && customerInstrumentValue(shopInstrument,customerInstrument)){
            instrumentStock.remove(shopInstrument);
            instrumentStock.add(customerInstrument);
        }
    }



//    public double potentialProfit() {
//        double profit = 0;
//        for (MusicInstrument instrument : this.instrumentStock) {
//            profit += (totalSellPriceInstruments() * instrument.markUp());
//        }
//        return profit;
//
//    }
}