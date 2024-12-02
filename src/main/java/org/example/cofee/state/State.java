package org.example.cofee;

// ---------------------- State ----------------------
// Интерфейс состояния кофемашины
interface State {
    void insertCoin();

    void selectCoffee();

    void dispenseCoffee();

    void cancel();
}
