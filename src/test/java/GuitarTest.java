import Instruments.Guitar;
import Type.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
