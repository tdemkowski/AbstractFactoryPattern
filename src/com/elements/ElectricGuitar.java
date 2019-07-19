package com.elements;

public class ElectricGuitar extends Guitar {

    private String model;
    private String brand;
    private String pickups;
    private double scaleLength;
    private int price;

    public ElectricGuitar(String model, String brand, String pickups, double scaleLength, int price) {
        this.model = model;
        this.brand = brand;
        this.pickups = pickups;
        this.scaleLength = scaleLength;
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getPickups() {
        return this.pickups;
    }

    @Override
    public double getScaleLength() {
        return this.scaleLength;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
