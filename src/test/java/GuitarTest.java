import jdk.nashorn.internal.runtime.SharedPropertyMap;
import org.junit.Before;
import org.junit.Test;
import stock.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(5,
                "Electric guitar",
                150.0,
                249.99,
                "Singer",
                "D400",
                "Plastic",
                "White");
    }

    @Test
    public void canGetNumStrings() {
        assertEquals(5, guitar.getNumStrings());
    }

    @Test
    public void canGetType() {
        assertEquals("Electric guitar", guitar.getType());
    }

    @Test
    public void canGetPriceBought() {
        assertEquals(150.0, guitar.getPriceBought(), 0.0);
    }

    @Test
    public void canGetPriceToSell() {
        assertEquals(249.99, guitar.getPriceToSell(), 0.0);
    }

    @Test
    public void canGetMake() {
        assertEquals("Singer", guitar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("D400", guitar.getModel());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Plastic", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("White", guitar.getColour());
    }

}
