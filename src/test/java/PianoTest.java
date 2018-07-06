import Instruments.Guitar;
import Instruments.Piano;
import Type.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Stratocaster", 400, 600, Family.KEYBOARD);
    }

    @Test
    public void hasName(){
        assertEquals("Stratocaster", piano.getName());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(400, piano.getCostPrice(),0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(600,piano.getSellPrice(),0.01);
    }

    @Test
    public void hasFamily(){
        assertEquals(Family.KEYBOARD, piano.getFamily());
    }

    @Test
    public void canPlaySong(){
        assertEquals("Plink Plonk I'm playing Freebird",piano.play("Freebird"));
    }
}
