package stock;

import abstracts.Instrument;

public class Guitar extends Instrument {

    private int numStrings;

    public Guitar(int numStrings, String type, double priceBought, double priceToSell, String make, String model, String material, String colour) {

        super(type, priceBought, priceToSell, make, model, material, colour);

        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public String play() {
        return "Twang!";
    }

}
