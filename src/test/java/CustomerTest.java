import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CustomerTest {
    Customer customer;
    Customer customer2;

    @Before
    public void setUp(){
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
}
