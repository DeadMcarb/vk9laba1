package org.example.first.factory;

import org.example.first.model.Coffe;
import org.example.first.model.Dog;

public class DogFactory extends CoffeFactory {
    @Override
    public Coffe createCoffe() {
        return new Dog();
    }
}
