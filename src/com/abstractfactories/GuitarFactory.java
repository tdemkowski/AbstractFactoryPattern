package com.abstractfactories;

import com.elements.Guitar;

public class GuitarFactory {

    public static Guitar getGuitar(GuitarAbstractFactory factory) {
        return factory.createGuitar();
    }

}
