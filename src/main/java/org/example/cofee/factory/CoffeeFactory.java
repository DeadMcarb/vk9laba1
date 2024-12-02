package org.example.first.factory;

import org.example.first.model.Coffe;

// Factory Method для создания животных
public abstract class CoffeFactory {
    public abstract Coffe createCoffe();

    public Coffe getCoffe() {
        Coffe coffe = createCoffe();
        System.out.println("Created a " + coffe.getName());
        return coffe;
    }
}
