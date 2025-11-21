package org.example.structural.decorator;

public class NoSugarCoffee extends CoffeeDecorator {

    public NoSugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "No Sugar Coffee";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5;
    }
}
