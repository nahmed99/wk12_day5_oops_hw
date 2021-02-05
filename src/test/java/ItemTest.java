import org.junit.Before;
import org.junit.Test;
import stock.Item;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    private Item item;


    @Before
    public void before() {
        item = new Item("Drum Sticks", 2.25, 9.99);
    }

    @Test
    public void canGetType() {
        assertEquals("Drum Sticks", item.getType());
    }

    @Test
    public void canGetPriceBought() {
        assertEquals(2.25, item.getPriceBought(), 0.0);
    }

    @Test
    public void canGetPriceToSell() {
        assertEquals(9.99, item.getPriceToSell(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(7.74, item.calculateMarkup(), 0.0);
    }

}
