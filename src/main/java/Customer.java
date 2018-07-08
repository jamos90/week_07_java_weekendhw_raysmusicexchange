import Behaviours.IBuy;
import Instruments.MusicInstrument;

import java.util.ArrayList;

public class Customer implements IBuy {
    private String name;
    private double wallet;
    private ArrayList<MusicInstrument> customerInstrument;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.customerInstrument = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public int instrumentCount() {
        return this.customerInstrument.size();
    }

    public void buy(double amount){
        this.wallet -= amount;
    }

    public void addToInstrumentCollection(MusicInstrument instrument){
        this.customerInstrument.add(instrument);
    }
}


