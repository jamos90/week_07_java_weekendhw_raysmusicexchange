import Behaviours.ISell;
import Instruments.MusicInstrument;


public class SellableInstrument implements ISell {

    private MusicInstrument instrument;
    private double buyPrice;
    private double sellPrice;

    public SellableInstrument(MusicInstrument instrument, double buyPrice, double sellPrice){
        this.instrument = instrument;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double markUp(){
        double margin = this.sellPrice - this.buyPrice;
        return margin/this.buyPrice;
    }

    public MusicInstrument getInstrument() {
        return this.instrument;
    }
}
