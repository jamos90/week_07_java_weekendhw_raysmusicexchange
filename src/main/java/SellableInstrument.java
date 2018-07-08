import Behaviours.ISell;
import Instruments.MusicInstrument;


public class SellableInstrument implements ISell {

    private MusicInstrument instrument;
    private double costPrice;
    private double sellPrice;

    public SellableInstrument(MusicInstrument instrument, double costPrice, double sellPrice){
        this.instrument = instrument;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public double markUp(){
        double margin = sellPrice() -costPrice();
        return (margin/costPrice())*100;
    }

    public MusicInstrument getInstrument() {
        return this.instrument;
    }

    public  double costPrice(){
        return this.instrument.getCostPrice();
    }

    public double sellPrice(){
        return this.instrument.getSellPrice();
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double totalSellPrice(){
        return this.sellPrice();
    }
}
