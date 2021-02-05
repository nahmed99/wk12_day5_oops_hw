import org.junit.Before;
import org.junit.Test;
import stock.Guitar;
import stock.Item;
import stock.Trumpet;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Trumpet trumpet;
    private Guitar guitar;
    private Item item;

    @Before
    public void before() {

        shop = new Shop();

        trumpet = new Trumpet(3,
                "Brass Trumpet",
                75.0,
                149.99,
                "Make Noise",
                "Loud One",
                "Brass",
                "Brass");

        guitar = new Guitar(5,
                "Electric guitar",
                150.0,
                249.99,
                "Singer",
                "D400",
                "Plastic",
                "White");

        item = new Item("Drum Sticks", 2.25, 9.99);

    }

    @Test
    public void stockEmptyOnStart() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addItem(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItemsFromStock() {

        // Add three items to stock and confirm that they have been added.
        shop.addItem(guitar);
        shop.addItem(item);
        shop.addItem(trumpet);
        assertEquals(3, shop.getStock().size());

        // Remove an item
        shop.removeItem(item);
        assertEquals(2, shop.getStock().size());

        shop.removeItem(item); // Already removed, therefore stock size shouldn't change.
        assertEquals(2, shop.getStock().size());

        // Remove another item
        shop.removeItem(trumpet);
        assertEquals(1, shop.getStock().size());
    }

}
