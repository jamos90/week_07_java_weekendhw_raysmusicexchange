import Instruments.Guitar;
import Instruments.MusicInstrument;
import Type.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellableInstrumentTest {

    SellableInstrument sellableInstrument;
    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Statocaster",400,566, Family.STRING );

        sellableInstrument = new SellableInstrument(guitar,455,700);
    }

    @Test
    public void canGetInsturment() {
        assertEquals(guitar, sellableInstrument.getInstrument());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(455,sellableInstrument.getCostPrice(),0.2);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(400,sellableInstrument.costPrice(),0.1);
    }

    @Test
    public void canGetSellPriceFromInstrument(){
        assertEquals(566,sellableInstrument.sellPrice(),0.1);
    }

    @Test
    public void canGetMarginFromInstrument(){
        assertEquals(41.5,sellableInstrument.markUp(),0.1);
    }
}
