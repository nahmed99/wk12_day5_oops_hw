package stock;

import abstracts.Sellable;

public class Item extends Sellable {

    public Item (String type, double priceBought, double priceToSell) {
        super(type, priceBought, priceToSell);
    }

}
