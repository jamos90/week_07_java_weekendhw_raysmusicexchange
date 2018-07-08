import Instruments.Guitar;
import Instruments.Piano;
import Type.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Piano piano2;


    @Before
    public void setUp(){
        guitar = new Guitar("Les Paul",345,600, Family.STRING);
        piano = new Piano("Baby Grand",345,400, Family.KEYBOARD);
        piano2 = new Piano("Baby Grand",345,400, Family.KEYBOARD);
        shop = new Shop(500);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void instrumentStockStartsEmpty(){
        assertEquals(0,shop.instrumentStockCount());
    }

    @Test
    public void hasTillAmount(){
        assertEquals(500,shop.getTill(),0.1);
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1,shop.stockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.sell(guitar);
        assertEquals(0,shop.stockCount());
    }

    @Test
    public void cannotRemoveFromStockIfIsNotAdded(){
        shop.addToStock(guitar);
        shop.sell(piano);
        assertEquals(1,shop.stockCount());
    }

    @Test
    public void canAddToInstrumentStock(){
        shop.addToInstruments(guitar);
        shop.addToInstruments(piano);
        assertEquals(2,shop.instrumentStockCount());
    }

    @Test
    public void canSellMusicalInsturment(){
        shop.addToInstruments(guitar);
        shop.addToInstruments(piano);
        shop.sellInstrument(guitar);
        assertEquals(1100,shop.getTill(),0.1);
    }

    @Test
    public void cannotSellInstrumentIfNotInStock(){
        shop.addToInstruments(guitar);
        shop.addToInstruments(piano);
        shop.sellInstrument(piano2);
        assertEquals(500,shop.getTill(),0.1);
    }

    @Test
    public void canGetTotalSellPriceInstruments() {
        shop.addToInstruments(guitar);
        shop.addToInstruments(piano);
        shop.addToInstruments(piano2);
        assertEquals(1800,shop.totalSellPriceInstruments(),0.1);
    }

    @Test
    public void canGetTotalSellPriceItems(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        assertEquals(1200,shop.totalSellPriceItems(),0.1);
    }

    @Test
    public void canExchangeInstruments(){
        shop.addToStock(guitar);
        shop.stockContainsInstrument(guitar,piano2);
        shop.customerInstrumentValue(guitar,piano2);
        shop.canTradeInstrument(guitar,piano2);
        assertEquals(true, shop.instrumentExists(piano2));
    }
//
    @Test
    public void cannotExchangeInstruments(){
        shop.addToStock(guitar);
        shop.stockContainsInstrument(guitar,piano2);
        shop.customerInstrumentValue(guitar,piano2);
        shop.canTradeInstrument(guitar, piano2);
        assertEquals(false,shop.instrumentExists(piano2));

    }

//    @Test
//    public void canGetPontialProfit(){
//        shop.addToStock(guitar);
//        shop.addToStock(piano);
//        assertEquals();
//    }


}
