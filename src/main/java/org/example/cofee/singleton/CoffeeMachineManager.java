package org.example.cofee;

// ---------------------- Singleton ----------------------
// Класс CoffeeMachineManager отвечает за управление кофемашиной и реализует паттерн Singleton.
class CoffeeMachineManager {
    private static CoffeeMachineManager instance;
    private CoffeeMachine coffeeMachine;

    private CoffeeMachineManager() {
        coffeeMachine = new CoffeeMachine();
    }

    public static CoffeeMachineManager getInstance() {
        if (instance == null) {
            instance = new CoffeeMachineManager();
        }
        return instance;
    }

    public CoffeeMachine getCoffeeMachine() {
        return coffeeMachine;
    }
}
