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
}
