package org.example.first.model;

// Конкретные реализации животных
public class Dog implements Coffe {
    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
}
