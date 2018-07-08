import Instruments.MusicInstrument;

import java.util.ArrayList;

public class Customer {
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
}


