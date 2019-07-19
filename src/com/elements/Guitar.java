package com.elements;

public abstract class Guitar {

    public abstract String getModel();
    public abstract String getBrand();
    public abstract String getPickups();
    public abstract double getScaleLength();
    public abstract int getPrice();

    public String toString() {
        return  "Model: "+this.getModel()
                +", Brand: "+this.getBrand()
                +", Pickups: "+this.getPickups()
                +", Scale Length: "+this.getScaleLength()
                +" inches, Price: "+this.getPrice()+" AUD";
    }

}
