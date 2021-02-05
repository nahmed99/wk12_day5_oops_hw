import org.junit.Before;
import stock.Item;

public class ItemTest {

    private Item item;


    @Before
    public void before() {
        item = new Item("Drum Sticks", 2.25, 9.99);
    }


}
