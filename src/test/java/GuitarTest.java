import Instruments.Guitar;
import Type.Family;
import org.junit.Before;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Stratocaster",400,600, Family.STRING);
    }

    @Test
}
