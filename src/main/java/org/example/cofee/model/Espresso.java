package org.example.first.model;

public class Cat implements Coffe {
    @Override
    public String getName() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
}
