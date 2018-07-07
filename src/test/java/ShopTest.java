import Instruments.Guitar;
import Instruments.Piano;
import Type.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;

    @Before
    public void setUp(){
        guitar = new Guitar("Les Paul",345,600, Family.STRING);
        piano = new Piano("Baby Grand",345,600, Family.KEYBOARD);
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
}
