package org.example.cofee;

// Реализация состояния "Приготовление кофе"
class BrewingState implements State {
    private final CoffeeMachine coffeeMachine;

    public BrewingState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Подождите. Идёт приготовление кофе.");
    }

    @Override
    public void selectCoffee() {
        System.out.println("Кофе уже готовится.");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Ваш кофе готов. Заберите его.");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }

    @Override
    public void cancel() {
        System.out.println("Нельзя отменить. Кофе уже готовится.");
    }
}
