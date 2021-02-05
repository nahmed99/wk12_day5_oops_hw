package abstracts;

import interfaces.IPlay;

public abstract class Instrument extends Sellable implements IPlay {

    private String make;
    private String model;
    private String material;
    private String colour;

    public Instrument (String type, double priceBought, double priceToSell, String make, String model, String material, String colour) {
        // Send data to super
        super(type, priceBought, priceToSell);

        // store instance data
        this.make = make;
        this.model = model;
        this.material = material;
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
