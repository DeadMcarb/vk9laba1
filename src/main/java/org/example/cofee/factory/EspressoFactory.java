package org.example.first.factory;

import org.example.first.model.Coffe;
import org.example.first.model.Cat;

public class EspressoFactory extends CoffeFactory {
    @Override
    public Coffe createCoffe() {
        return new Cat();
    }
}
