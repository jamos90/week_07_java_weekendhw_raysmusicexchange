import Instruments.Guitar;
import Type.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Stratocaster", 400, 600, Family.STRING);
    }

    @Test
    public void hasName(){
        assertEquals("Stratocaster", guitar.getName());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(400, guitar.getCostPrice(),0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(600,guitar.getSellPrice(),0.01);
    }

    @Test
    public void hasFamily(){
        assertEquals(Family.STRING, guitar.getFamily());
    }
}
