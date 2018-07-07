import Instruments.Guitar;
import Type.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void setUp(){
        shop = new Shop(500);
        guitar = new Guitar("Les Paul",345,600, Family.STRING);
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
    public void hasTillAmmount(){
        assertEquals(500,shop.getTill(),0.1);
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1,shop.stockCount());
    }

    @Test
    public void canAddToInstrumentStock(){
        shop.addToInstruments(guitar);
        assertEquals(1,shop.stockCount());
    }
}
