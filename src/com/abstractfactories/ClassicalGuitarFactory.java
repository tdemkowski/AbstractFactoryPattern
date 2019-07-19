package com.abstractfactories;

import com.elements.ClassicalGuitar;
import com.elements.Guitar;

public class ClassicalGuitarFactory implements GuitarAbstractFactory  {

    private String model;
    private String brand;
    private String pickups;
    private double scaleLength;
    private int price;

    public ClassicalGuitarFactory(String model, String brand, String pickups, double scaleLength, int price) {
        this.model = model;
        this.brand = brand;
        this.pickups = pickups;
        this.scaleLength = scaleLength;
        this.price = price;
    }

    @Override
    public Guitar createGuitar() {
        return new ClassicalGuitar(model,brand,pickups,scaleLength,price);
    }

}
