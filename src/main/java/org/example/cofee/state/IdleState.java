package org.example.cofee;

// Реализация состояния "Ожидание монеты"
class IdleState implements State {
    private final CoffeeMachine coffeeMachine;

    public IdleState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Монета принята. Выберите кофе.");
        coffeeMachine.setState(coffeeMachine.getReadyState());
    }

    @Override
    public void selectCoffee() {
        System.out.println("Сначала нужно вставить монету.");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Сначала нужно выбрать кофе.");
    }

    @Override
    public void cancel() {
        System.out.println("Нечего отменять.");
    }
}
