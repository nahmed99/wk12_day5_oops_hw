import interfaces.ISell;
import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addItem(ISell item) {
        stock.add(item);
    }

    public void removeItem(ISell item) {
        stock.remove(item);
    }
}
