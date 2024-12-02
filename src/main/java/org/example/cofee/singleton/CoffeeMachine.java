package org.example.cofee;

// ---------------------- Контекст ----------------------
// Класс CoffeeMachine, использующий состояния
class CoffeeMachine {
    private final State idleState;
    private final State readyState;
    private final State brewingState;

    private State currentState;

    public CoffeeMachine() {
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        brewingState = new BrewingState(this);

        currentState = idleState; // Начальное состояние
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getReadyState() {
        return readyState;
    }

    public State getBrewingState() {
        return brewingState;
    }

    // Методы для взаимодействия с кофемашиной
    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectCoffee() {
        currentState.selectCoffee();
    }

    public void dispenseCoffee() {
        currentState.dispenseCoffee();
    }

    public void cancel() {
        currentState.cancel();
    }
}
