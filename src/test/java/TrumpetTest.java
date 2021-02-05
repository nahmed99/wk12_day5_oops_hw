import org.junit.Before;
import org.junit.Test;
import stock.Guitar;
import stock.Trumpet;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {


    private Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(3,
                "Brass Trumpet",
                75.0,
                149.99,
                "Make Noise",
                "Loud One",
                "Brass",
                "Brass");
    }

    @Test
    public void canGetNumStrings() {
        assertEquals(3, trumpet.getNumValves());
    }

    @Test
    public void canGetType() {
        assertEquals("Brass Trumpet", trumpet.getType());
    }

    @Test
    public void canGetPriceBought() {
        assertEquals(75.0, trumpet.getPriceBought(), 0.0);
    }

    @Test
    public void canGetPriceToSell() {
        assertEquals(149.99, trumpet.getPriceToSell(), 0.0);
    }

    @Test
    public void canGetMake() {
        assertEquals("Make Noise", trumpet.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Loud One", trumpet.getModel());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brass", trumpet.getColour());
    }

}
