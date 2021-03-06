import Instruments.Guitar;
import Instruments.Piano;
import Type.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CustomerTest {
    Customer customer;
    Customer customer2;
    Guitar guitar;
    Piano piano;

    @Before
    public void setUp(){
        guitar = new Guitar("Les Paul",500,800, Family.STRING);
        piano = new Piano("Baby Grand",500,700,Family.KEYBOARD);
        customer = new Customer("Jess",500);
        customer2 = new Customer("James",400);

    }

    @Test
    public void hasName(){
        assertEquals("Jess", customer.getName());
    }

    @Test
    public void hasWalletAmount(){
        assertEquals(500,customer.getWallet(),0.1);
    }

    @Test
    public void customerStartsWithNoInstument(){
        assertEquals(0,customer.instrumentCount());
    }

    @Test
    public void canAddToCustomersCollection(){
        customer.addToInstrumentCollection(guitar);
        assertEquals(1,customer.instrumentCount());
    }

    @Test
    public void canFindInstrumentFromArray(){
        customer.addToInstrumentCollection(guitar);
        assertEquals("Les Paul",customer.getInstrumentFromCollection(guitar));
    }

    @Test
    public void cannotFindIfInstrumentDoesNotExist(){
        customer.addToInstrumentCollection(piano);
        assertEquals("not found",customer.getInstrumentFromCollection(guitar));
    }
}
