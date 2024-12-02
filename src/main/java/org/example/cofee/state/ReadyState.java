package org.example.cofee;

// Реализация состояния "Готовность к приготовлению кофе"
class ReadyState implements State {
    private final CoffeeMachine coffeeMachine;

    public ReadyState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Монета уже вставлена. Выберите кофе.");
    }

    @Override
    public void selectCoffee() {
        System.out.println("Кофе выбрано. Приготовление началось.");
        coffeeMachine.setState(coffeeMachine.getBrewingState());
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Сначала выберите кофе.");
    }

    @Override
    public void cancel() {
        System.out.println("Отмена. Возврат монеты.");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }
}
