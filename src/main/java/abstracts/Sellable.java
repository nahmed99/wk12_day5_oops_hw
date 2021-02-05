package abstracts;

import interfaces.ISell;

public abstract class Sellable implements ISell {

    private String type;
    private double priceBought;
    private double priceToSell;

    public Sellable(String type, double priceBought, double priceToSell){

        this.type = type;
        this.priceBought = priceBought;
        this.priceToSell = priceToSell;

    }

    // Setters and Getters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public void setPriceBought(double priceBought) {
        this.priceBought = priceBought;
    }

    public double getPriceToSell() {
        return priceToSell;
    }

    public void setPriceToSell() {
        this.priceToSell = priceToSell;
    }

    public double calculateMarkup() {
        return getPriceToSell() - getPriceBought();
    }
}
