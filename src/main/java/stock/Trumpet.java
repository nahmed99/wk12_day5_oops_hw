package stock;

import abstracts.Instrument;

public class Trumpet extends Instrument {

    private int numValves;

    public Trumpet(int numValves, String type, double priceBought, double priceToSell, String make, String model, String material, String colour) {

        super(type, priceBought, priceToSell, make, model, material, colour);

        this.numValves = numValves;
    }

    public int getNumValves() {
        return numValves;
    }

    public void setNumValves(int numValves) {
        this.numValves = numValves;
    }

    public String play() {
        return "Screech!";
    }

}
